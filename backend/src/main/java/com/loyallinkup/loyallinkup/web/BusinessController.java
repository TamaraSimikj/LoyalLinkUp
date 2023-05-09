package com.loyallinkup.loyallinkup.web;


import com.loyallinkup.loyallinkup.model.Business;
import com.loyallinkup.loyallinkup.model.dto.BusinessDto;
import org.springframework.web.bind.annotation.*;
import com.loyallinkup.loyallinkup.service.BusinessService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/business")
public class BusinessController {

        private final BusinessService businessService;

        public BusinessController(BusinessService businessService) {
            this.businessService = businessService;
        }

        @GetMapping
        public List<Business> getAllBusinesses() {
            return businessService.listAll();
        }

        @GetMapping("/{id}")
        public Business getBusinessById(@PathVariable Long id) {
            Business business = businessService.findById(id);
            return business;
        }

        @PostMapping("/add")
        public Business createBusiness(@RequestBody BusinessDto businessDto) {
            Business createdBusiness = businessService.create(businessDto);
            return createdBusiness;
        }

        @PutMapping("/{id}")
        public Business updateBusiness(@PathVariable Long id, @RequestBody BusinessDto businessDto) {
            Business updatedBusiness = businessService.edit(id, businessDto);
            return updatedBusiness;
        }

        @DeleteMapping("/{id}")
        public boolean deleteBusiness(@PathVariable Long id) {
            boolean deleted = businessService.delete(id);
            return deleted;
        }
}

