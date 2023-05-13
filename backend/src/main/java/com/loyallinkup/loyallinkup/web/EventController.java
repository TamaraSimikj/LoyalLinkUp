package com.loyallinkup.loyallinkup.web;


import com.loyallinkup.loyallinkup.model.Event;
import com.loyallinkup.loyallinkup.model.dto.EventDto;
import com.loyallinkup.loyallinkup.service.EventService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/event")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.listAll();
    }

    @GetMapping("/{id}")
    public Event getEventById(@PathVariable Long id) {
        Event event = eventService.findById(id);
        return event;
    }

    @PostMapping("/add")
    public Event createEvent(@RequestBody EventDto eventDto) {
        Event createdEvent = eventService.create(eventDto);
        return createdEvent;
    }

    @PutMapping("/edit/{id}")
    public Event updateEvent(@PathVariable Long id, @RequestBody EventDto eventDto) {
        Event updatedEvent = eventService.edit(id, eventDto);
        return updatedEvent;
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteEvent(@PathVariable Long id) {
        boolean deleted = eventService.delete(id);
        return deleted;
    }

}
