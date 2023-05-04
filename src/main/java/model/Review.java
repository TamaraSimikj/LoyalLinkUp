package model;


import jakarta.persistence.*;
import model.Enum.TypeOfEvent;

import java.time.LocalDateTime;

@Table(name = "reviews")
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long review_id;

    private LocalDateTime date_time;

    private String comment;

    private Integer grade;

}