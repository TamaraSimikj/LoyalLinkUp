package model;

import jakarta.persistence.*;

@Table(name = "clients_events")
@Entity
public class ClientsEvents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="event_id")
    private Event event_id;

    @OneToOne
    @JoinColumn(name="client_id")
    private Client client_id;
}
