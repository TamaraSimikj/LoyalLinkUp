package com.loyallinkup.loyallinkup.service;

import com.loyallinkup.loyallinkup.model.Event;
import com.loyallinkup.loyallinkup.model.dto.EventDto;

import java.util.List;

public interface EventService {

        List<Event> listAll();

        Event findById (Long event_id);

        Event create (Long event_id, EventDto eventDto);

        Event edit (Long event_id, EventDto eventDto);

        Boolean delete (Long id);
}