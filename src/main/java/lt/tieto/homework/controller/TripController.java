package lt.tieto.homework.controller;

import lt.tieto.homework.payload.TripInfoDTO;
import lt.tieto.homework.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class TripController {
    @Autowired
    ItemRetriever itemRetriever;

    @PostMapping("/trip")
    public ResponseEntity<Map<String, Integer>> getTripItems(@RequestBody TripInfoDTO tripInfoDTO) {
        try {
            itemRetriever.setCalculator(getCalculatorChain());
            return new ResponseEntity<>(itemRetriever.retrieveItems(tripInfoDTO.getKilometers(), tripInfoDTO.getSeason())
                    .entrySet().stream()
                    .collect(Collectors.toMap(c -> c.getKey().toString(), Map.Entry::getValue)),
                    HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private Calculator getCalculatorChain() {
        Calculator nightsCalculator = new NightsCalculator();
        Calculator mealsCalculator = new MealsCalculator();
        Calculator miscItemsCalculator = new MiscItemsCalculator();

        nightsCalculator.linkWith(mealsCalculator);
        mealsCalculator.linkWith(miscItemsCalculator);
        return nightsCalculator;
    }

}
