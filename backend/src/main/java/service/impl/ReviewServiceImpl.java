package service.impl;

import model.Business;
import model.Client;
import model.Event;
import model.Review;
import model.dto.ReviewDto;
import org.springframework.stereotype.Service;
import repo.ReviewRepo;
import service.BusinessService;
import service.ClientService;
import service.EventService;
import service.ReviewService;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepo reviewRepo;
    private final ClientService clientService;
    private final BusinessService businessService;
    private final EventService eventService;

    public ReviewServiceImpl(ReviewRepo reviewRepo, ClientService clientService, BusinessService businessService, EventService eventService) {
        this.reviewRepo = reviewRepo;
        this.clientService = clientService;
        this.businessService = businessService;
        this.eventService = eventService;
    }

    @Override
    public List<Review> listAll() {
        return this.reviewRepo.findAll();
    }

    @Override
    public Review findById(Long id) {
        return this.reviewRepo.findById(id).get();
    }

    @Override
    public Boolean deleteById(Long id) {
        if(this.reviewRepo.findById(id).isPresent()){
            this.reviewRepo.deleteById(id);
            return true;
        }else
            return false;
    }

    @Override
    public Review edit(Long id, ReviewDto reviewDto) {

        Review review = this.reviewRepo.findById(id).get();
        review.setDate_time(reviewDto.getDate_time());
        review.setComment(reviewDto.getComment());
        review.setGrade(reviewDto.getGrade());

        Client client = this.clientService.findById(reviewDto.getClient_id()).get();
        Business business = this.businessService.findById(reviewDto.getBusiness_id()).get();
        Event event = this.eventService.findById(reviewDto.getEvent_id()).get();
        // ne raboti(crveno) deka nema seuste eventService Impl
        review.setClient(client);
        review.setBusiness(business);
        review.setEvent(event);
        return this.reviewRepo.save(review);
    }

    @Override
    public Review create(ReviewDto reviewDto) {

        Client client = this.clientService.findById(reviewDto.getClient_id()).get();
        Business business = this.businessService.findById(reviewDto.getBusiness_id()).get();
        Event event = this.eventService.findById(reviewDto.getEvent_id()).get();

        Review review = new Review(reviewDto.getDate_time(),reviewDto.getComment(),
                                reviewDto.getGrade(),
                                client,business,event);
        return this.reviewRepo.save(review);
    }

    @Override
    public List<Review> listByClientId(Long client_id) {
        return this.reviewRepo.findAlLByClientId(client_id);
    }

    @Override
    public List<Review> listByBusinessId(Long business_id) {
        return this.reviewRepo.findAlLByBusinessId(business_id);
    }

    @Override
    public List<Review> listByEventId(Long event_id) {
        return this.reviewRepo.findAlLByEventId(event_id);
    }
}
