package model;

import jakarta.persistence.*;

@Table(name = "points")
@Entity
public class Points {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long points_id;

    private Integer loyal_points;

    private Integer loyal_awards;

    @OneToOne
    @JoinColumn(name="business_id")
    private Business business_id;

    @OneToOne
    @JoinColumn(name="client_id")
    private Client client_id;

}
