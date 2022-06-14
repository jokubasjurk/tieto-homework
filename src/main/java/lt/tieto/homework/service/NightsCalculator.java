package lt.tieto.homework.service;

import lt.tieto.homework.model.Item;
import lt.tieto.homework.model.Season;

import java.util.Map;

public class NightsCalculator extends Calculator {

    public NightsCalculator() {
    }

    @Override
    public Map<Item, Integer> getItems(double kilometers, Season season, Map<Item, Integer> items, int calculatedTripDays) {
        if (calculatedTripDays > 1) {
            items.put(Item.TENT, 1);
            items.put(Item.SLEEPING_BAG, 1);
            items.put(Item.TOOTHBRUSH_AND_TOOTHPASTE, 1);
            if (season == Season.WINTER) {
                items.put(Item.THERMO_CLOTHES, 1);
            }
        }
        return getItemsNext(kilometers, season, items, calculatedTripDays);
    }
}
