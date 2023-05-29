package com.loyallinkup.loyallinkup.service.impl;

import com.loyallinkup.loyallinkup.model.Address;
import com.loyallinkup.loyallinkup.model.Business;
import com.loyallinkup.loyallinkup.model.dto.BusinessDto;
import com.loyallinkup.loyallinkup.model.exceptions.InvalidBusinessIdException;
import com.loyallinkup.loyallinkup.repo.AddressRepo;
import com.loyallinkup.loyallinkup.service.BusinessService;
import org.springframework.stereotype.Service;
import com.loyallinkup.loyallinkup.repo.BusinessRepo;

import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {

    private final BusinessRepo businessRepo;
    private final AddressRepo addressRepo;
    public BusinessServiceImpl(BusinessRepo businessRepo, AddressRepo addressRepo) {
        this.businessRepo = businessRepo;
        this.addressRepo = addressRepo;
    }

    @Override
    public Business create(BusinessDto businessDto) {

        Address address = new Address( businessDto.getAddressDto().getCity_name(),
                businessDto.getAddressDto().getStreet_name(),
                businessDto.getAddressDto().getStreet_number());

        address = this.addressRepo.save(address);

        Business business = new Business(businessDto.getName(),
                address, businessDto.getPhone_number(),
               businessDto.getType_of_business());

        return this.businessRepo.save(business);
    }

    @Override
    public Business edit(Long id, BusinessDto businessDto) {

        Business business = this.businessRepo.findById(id).orElseThrow(InvalidBusinessIdException::new);
            business.setName(businessDto.getName());

            business.setAddress(new Address(
                    businessDto.getAddressDto().getCity_name(),
                    businessDto.getAddressDto().getStreet_name(),
                    businessDto.getAddressDto().getStreet_number()));

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
