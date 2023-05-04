package model;

import jakarta.persistence.*;
import model.Enum.TypeOfBusiness;

@Entity
@Table(name = "clients")
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    private String adress;

    private String phone_number;

    @Enumerated(value = EnumType.STRING)
    private TypeOfBusiness type_of_business;

}
