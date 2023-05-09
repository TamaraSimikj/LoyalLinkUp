package com.loyallinkup.loyallinkup.service;

import com.loyallinkup.loyallinkup.model.Business;
import com.loyallinkup.loyallinkup.model.dto.BusinessDto;

import java.util.List;

public interface BusinessService {

    Business create(BusinessDto businessDto);

    Business edit(Long id, BusinessDto businessDto);

    Boolean delete(Long id);

    List<Business> listAll();

    Business findById(Long id);

    //TODO:Event addEvent(EventDto eventDto); + drugite
}
