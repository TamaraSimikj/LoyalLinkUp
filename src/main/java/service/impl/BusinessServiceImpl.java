package service.impl;

import model.Business;
import model.dto.BusinessDto;
import model.exceptions.InvalidBusinessIdException;
import org.springframework.stereotype.Service;
import repo.BusinessRepo;
import service.BusinessService;

import java.util.List;
import java.util.Optional;

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
    public Optional<Business> findById(Long id) {
        return this.businessRepo.findById(id);
    }
}
