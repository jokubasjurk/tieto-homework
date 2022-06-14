package lt.tieto.homework.payload;

import lombok.Getter;
import lombok.Setter;
import lt.tieto.homework.model.Season;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class TripInfoDTO {

    @NotEmpty
    private long kilometers;
    @NotEmpty
    @Enumerated(EnumType.STRING)
    private Season season;

}
