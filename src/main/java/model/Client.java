package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Table(name = "clients")
@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 0L;

    private String name;
    private String surname;
    private String phone_number;

    public Client(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phone_number = phoneNumber;
    }

    public Client() {

    }
}
