package service;

import model.Business;
import model.Enum.TypeOfEvent;
import model.Event;
import model.dto.EventDto;

import java.time.LocalDateTime;
import java.util.List;

public interface EventService {

        List<Event> listAll();

        Event findById (Long event_id);

        Event create (Long event_id, EventDto eventDto);

        Event edit (Long event_id, EventDto eventDto);

        Boolean delete (Long id);
}
