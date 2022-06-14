package lt.tieto.homework.service;

import lt.tieto.homework.model.Item;
import lt.tieto.homework.model.Season;

import java.util.Map;

public class MealsCalculator extends Calculator {

    public MealsCalculator() {
    }

    @Override
    public Map<Item, Integer> getItems(double kilometers, Season season, Map<Item, Integer> items, int calculatedTripDays) {
        items.put(Item.FULL_MEAL, calculatedTripDays * season.getMealsPerDay());
        return getItemsNext(kilometers, season, items, calculatedTripDays);
    }
}
