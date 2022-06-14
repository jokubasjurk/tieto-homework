package lt.tieto.homework.payload;

import lombok.Getter;
import lombok.Setter;
import lt.tieto.homework.model.Season;

@Getter
@Setter
public class TripInfoDTO {

    private long kilometers;
    private Season season;

}
