package model.dto;

import lombok.Data;
import model.Enum.TypeOfEvent;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
public class EventDto {
    private String name;
    private LocalDateTime date_time;
    private TypeOfEvent type_of_event;
    private Integer capacity;
    private Long business_id;


}
