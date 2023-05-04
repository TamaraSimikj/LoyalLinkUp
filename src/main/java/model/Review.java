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

    @ManyToOne
    @JoinColumn(name="business_id")
    private Business business_id;

    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client_id;

    @ManyToOne
    @JoinColumn(name="event_id")
    private Event event_id;


}