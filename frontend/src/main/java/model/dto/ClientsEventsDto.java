package model.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import model.Client;
import model.Event;
@Data
public class ClientsEventsDto {

    private Long event_id;

    private Long client_id;
}
