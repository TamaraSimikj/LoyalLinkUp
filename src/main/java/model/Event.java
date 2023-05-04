package model;

import jakarta.persistence.*;
import model.Enum.TypeOfEvent;

import java.time.LocalDateTime;

@Table(name = "events")
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long event_id;

    private String name;

    private LocalDateTime date_time;

    @Enumerated(value = EnumType.STRING)
    private TypeOfEvent type_of_event;

    private Integer capacity;

    @ManyToOne
    @JoinColumn(name="business_id")
    private Business business;
}
