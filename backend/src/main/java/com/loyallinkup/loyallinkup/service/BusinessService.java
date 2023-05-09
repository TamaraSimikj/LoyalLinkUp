package com.loyallinkup.loyallinkup.service;

import com.loyallinkup.loyallinkup.model.Business;
import com.loyallinkup.loyallinkup.model.dto.BusinessDto;

import java.util.List;
import java.util.Optional;

public interface BusinessService {

    Business create(BusinessDto businessDto);

    Business edit(Long id, BusinessDto businessDto);

    Boolean delete(Long id);

    List<Business> listAll();

    Optional<Business> findById(Long id);

    //TODO:Event addEvent(EventDto eventDto); + drugite
}
