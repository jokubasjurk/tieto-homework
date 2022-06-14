package lt.tieto.homework.service;

import lt.tieto.homework.model.Item;
import lt.tieto.homework.model.Season;

import java.util.Map;

public class MiscItemsCalculator extends Calculator {

    public MiscItemsCalculator() {
    }

    @Override
    public Map<Item, Integer> getItems(double kilometers, Season season, Map<Item, Integer> items, int calculatedTripDays) {
        switch (season) {
            case AUTUMN:
            case SPRING:
                items.put(Item.UMBRELLA, 1);
                break;
            case SUMMER:
                items.put(Item.SUNGLASSES, 1);
                break;
            case WINTER:
                items.put(Item.FUR_CAP, 1);
                break;
        }
        return getItemsNext(kilometers, season, items, calculatedTripDays);
    }
}
