package model.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import model.Client;
import model.Event;

public class ClientsEventsDto {

    private Long event_id;

    private Long client_id;
}
