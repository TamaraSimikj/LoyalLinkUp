package model.dto;

import lombok.Data;
import model.Enum.TypeOfBusiness;

@Data
public class BusinessDto {

    private String name;

    private String address;

    private String phone_number;

    private TypeOfBusiness type_of_business;

}
