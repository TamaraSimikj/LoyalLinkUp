package model;

import jakarta.persistence.*;
import lombok.Data;
import model.Enum.TypeOfBusiness;
import model.dto.BusinessDto;

@Entity
@Table(name = "clients")
@Data
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 0L;

    private String name;

    private String address;

    private String phone_number;

    @Enumerated(value = EnumType.STRING)
    private TypeOfBusiness type_of_business;

    public Business(){

    }

    public Business(String name, String address, String phone_number, TypeOfBusiness type_of_business) {
      this.name = name;
      this.address = address;
      this.phone_number = phone_number;
      this.type_of_business = type_of_business;
    }
}
