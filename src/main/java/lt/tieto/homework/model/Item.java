package lt.tieto.homework.model;

public enum Item {
    UMBRELLA("Umbrella"),
    SUNGLASSES("Sunglasses"),
    TENT("Tent"),
    SLEEPING_BAG("Sleeping bag"),
    FUR_CAP("Fur cap"),
    FULL_MEAL("Full meal (food and water)"),
    TOOTHBRUSH_AND_TOOTHPASTE("Toothbrush and toothpaste"),
    THERMO_CLOTHES("Thermo clothes");
    private String itemName;
    Item (String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return itemName;
    }
}
