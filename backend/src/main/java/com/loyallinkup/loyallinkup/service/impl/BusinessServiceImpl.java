package com.loyallinkup.loyallinkup.service.impl;

import com.loyallinkup.loyallinkup.model.Business;
import com.loyallinkup.loyallinkup.model.dto.BusinessDto;
import com.loyallinkup.loyallinkup.model.exceptions.InvalidBusinessIdException;
import com.loyallinkup.loyallinkup.service.BusinessService;
import org.springframework.stereotype.Service;
import com.loyallinkup.loyallinkup.repo.BusinessRepo;

import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {

    private final BusinessRepo businessRepo;

    public BusinessServiceImpl(BusinessRepo businessRepo) {
        this.businessRepo = businessRepo;
    }

    @Override
    public Business create(BusinessDto businessDto) {
       Business business = new Business(businessDto.getName(),
                businessDto.getAddress(), businessDto.getPhone_number(),
               businessDto.getType_of_business());

        return this.businessRepo.save(business);
    }

    @Override
    public Business edit(Long id, BusinessDto businessDto) {

        Business business = this.businessRepo.findById(id).orElseThrow(InvalidBusinessIdException::new);
            business.setName(businessDto.getName());
            business.setAddress(businessDto.getAddress());
            business.setPhone_number(businessDto.getPhone_number());
            business.setType_of_business(businessDto.getType_of_business());
            this.businessRepo.save(business);
         return business;
    }

    @Override
    public Boolean delete(Long id) {
        if(this.businessRepo.findById(id).isPresent()){
            this.businessRepo.deleteById(id);
            return true;
        }else
            return false;
    }

    @Override
    public List<Business> listAll() {
        return this.businessRepo.findAll();
    }

    @Override
    public Business findById(Long id) {
        return this.businessRepo.findById(id).get();
    }
}
