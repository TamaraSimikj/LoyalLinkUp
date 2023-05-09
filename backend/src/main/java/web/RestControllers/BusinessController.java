package web.RestControllers;

import model.Business;
import model.dto.BusinessDto;
import org.springframework.web.bind.annotation.*;
import service.BusinessService;

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
        public Optional<Business> getBusinessById(@PathVariable Long id) {
            Optional<Business> business = businessService.findById(id);
            //return business.map(ResponseEntity::ok)
            //        .orElseGet(() -> ResponseEntity.notFound().build());
            return business;
        }

        @PostMapping("/add")
        public Business createBusiness(@RequestBody BusinessDto businessDto) {
            Business createdBusiness = businessService.create(businessDto);
            //return ResponseEntity.created(URI.create("/business/" + createdBusiness.getId())).body(createdBusiness);
            return createdBusiness;
        }

        @PutMapping("/{id}")
        public Business updateBusiness(@PathVariable Long id, @RequestBody BusinessDto businessDto) {
            Business updatedBusiness = businessService.edit(id, businessDto);
            //return ResponseEntity.ok(updatedBusiness);
            return updatedBusiness;
        }

        @DeleteMapping("/{id}")
        public boolean deleteBusiness(@PathVariable Long id) {
            boolean deleted = businessService.delete(id);
            return deleted;// ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
        }
}

