package model;

import jakarta.persistence.*;

@Table(name = "favorites")
@Entity
public class Favorites {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long favorites_id;

    @OneToOne
    @JoinColumn(name="business_id")
    private Business business_id;

    @OneToOne
    @JoinColumn(name="client_id")
    private Client client_id;
}
