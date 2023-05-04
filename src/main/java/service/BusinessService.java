package service;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import model.Business;
import model.Enum.TypeOfBusiness;
import model.dto.BusinessDto;

import java.util.List;

public interface BusinessService {

    Business create(BusinessDto businessDto);

    Business edit(Long id, BusinessDto businessDto);

    Boolean delete(Long id);

    List<Business> listAll();

    Business findById(Long id);

    //TODO:Event addEvent(EventDto eventDto); + drugite
}
