package model.dto;

import model.Business;
import model.Enum.TypeOfEvent;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class EventDto {
    private String name;
    private LocalDateTime date_time;
    private TypeOfEvent type_of_event;
    private Integer capacity;
    private BigInteger business_id;
}
