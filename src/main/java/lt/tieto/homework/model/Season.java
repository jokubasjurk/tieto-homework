package lt.tieto.homework.model;

import lombok.Getter;

@Getter
public enum Season {
    SUMMER(50, 5),
    AUTUMN(25, 4),
    WINTER(10, 7),
    SPRING(30, 4);

    private final int kmPerDay;
    private final int mealsPerDay;
    Season(int kmPerDay, int mealsPerDay) {
        this.kmPerDay = kmPerDay;
        this.mealsPerDay = mealsPerDay;
    }
}
