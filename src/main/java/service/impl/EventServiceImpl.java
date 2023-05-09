package service.impl;

import model.Business;
import model.Event;
import model.Review;
import model.dto.EventDto;
import repo.EventRepo;
import service.BusinessService;
import service.EventService;

import java.util.List;

public class EventServiceImpl implements EventService {

    private final EventRepo eventRepo;
    private final BusinessService businessService;

    public EventServiceImpl(EventRepo eventRepo, BusinessService businessService) {
        this.eventRepo = eventRepo;
        this.businessService = businessService;
    }

    @Override
    public List<Event> listAll() {
        return this.eventRepo.findAll();
    }

    @Override
    public Event findById(Long event_id) {
        return this.eventRepo.findById(event_id).get();
    }

    @Override
    public Event create(Long event_id, EventDto eventDto) {

        Event event = this.eventRepo.findById(event_id).get();
        Business business = this.businessService.findById(eventDto.getBusiness_id()).get();


        Event event1 = new Event(event_id, eventDto.getName(), eventDto.getDate_time(), eventDto.getType_of_event(),
                eventDto.getCapacity(), business);

        return eventRepo.save(event1);
    }

    @Override
    public Event edit(Long event_id, EventDto eventDto) {

        Event event = this.eventRepo.findById(event_id).get();
        Business business = this.businessService.findById(eventDto.getBusiness_id()).get();

        event.setEvent_id(event_id);
        event.setName(event.getName());
        event.setDate_time(event.getDate_time());
        event.setType_of_event(event.getType_of_event());
        event.setCapacity(event.getCapacity());
        event.setBusiness(business);

        return this.eventRepo.save(event);
    }

    @Override
    public Boolean delete(Long id) {
        if(this.eventRepo.findById(id).isPresent()){
            this.eventRepo.deleteById(id);
            return true;
        }else
            return false;
    }
}
