package com.loyallinkup.loyallinkup.model;

import jakarta.persistence.*;
import lombok.Data;
import com.loyallinkup.loyallinkup.model.Enum.TypeOfEvent;

import java.time.LocalDateTime;

@Table(name = "events")
@Entity
@Data
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 0L;

    private String name;

    private LocalDateTime date_time;

    @Enumerated(value = EnumType.STRING)
    private TypeOfEvent type_of_event;

    private Integer capacity;

    @ManyToOne
    @JoinColumn(name="business_id")
    private Business business;

    public Event(Long event_id, String name, LocalDateTime date_time, TypeOfEvent type_of_event, Integer capacity, Business business) {
        this.id = event_id;
        this.name = name;
        this.date_time = date_time;
        this.type_of_event = type_of_event;
        this.capacity = capacity;
        this.business = business;
    }

    public Event() {
    }

    public Event(String name, LocalDateTime date_time, TypeOfEvent type_of_event, Integer capacity, Business business) {
    }
}