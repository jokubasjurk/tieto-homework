package lt.tieto.homework.service;

import lt.tieto.homework.model.Item;
import lt.tieto.homework.model.Season;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ItemRetriever {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public Map<Item, Integer> retrieveItems(double kilometers, Season season) {
        HashMap<Item, Integer> requiredItems = new HashMap<>();
        int calculatedTripDays = (int) kilometers / season.getKmPerDay();
        return calculator.getItems(kilometers, season, requiredItems, calculatedTripDays);
    }
}
