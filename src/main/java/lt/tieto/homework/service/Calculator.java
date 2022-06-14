package lt.tieto.homework.service;

import lt.tieto.homework.model.Item;
import lt.tieto.homework.model.Season;

import java.util.Map;

public abstract class Calculator {

    private Calculator next;

    public Calculator() {
    }

    public Calculator linkWith(Calculator next) {
        this.next = next;
        return next;
    }

    public abstract Map<Item, Integer> getItems(double kilometers, Season season, Map<Item, Integer> items, int calculatedTripDays);

    protected Map<Item, Integer> getItemsNext(double kilometers, Season season, Map<Item, Integer> items, int calculatedTripDays) {
        if (next == null) {
            return items;
        }
        return next.getItems(kilometers, season, items, calculatedTripDays);
    }

}
