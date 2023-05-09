package model.dto;

import jakarta.persistence.*;
import lombok.Data;
import model.Business;
import model.Client;
import model.Event;

import java.time.LocalDateTime;

@Data
public class ReviewDto {

    private LocalDateTime date_time;

    private String comment;

    private Integer grade;

    private Long business_id;

    private Long client_id;
    private Long event_id;
}
