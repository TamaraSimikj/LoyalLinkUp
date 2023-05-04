package service;

import model.Client;
import model.ClientsEvents;
import model.dto.ClientsEventsDto;

import java.util.List;

public interface ClientsEventsService {
    List<ClientsEvents> listAll ();
    ClientsEvents findById(Long id);

    Boolean deleteById(Long id);

    ClientsEvents editById(Long id, ClientsEventsDto clientsEventsDto);

    ClientsEvents create(ClientsEventsDto clientsEventsDto);

}
