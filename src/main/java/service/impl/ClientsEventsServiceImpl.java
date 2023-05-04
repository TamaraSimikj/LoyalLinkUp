package service.impl;

import model.ClientsEvents;
import model.dto.ClientsEventsDto;
import org.springframework.stereotype.Service;
import repo.ClientsEventsRepo;
import service.ClientsEventsService;

import java.util.List;

@Service
public class ClientsEventsServiceImpl implements ClientsEventsService {

    private final ClientsEventsRepo clientsEventsRepo;

    public ClientsEventsServiceImpl(ClientsEventsRepo clientsEventsRepo) {
        this.clientsEventsRepo = clientsEventsRepo;
    }

    @Override
    public List<ClientsEvents> listAll() {
        return clientsEventsRepo.findAll();
    }

    @Override
    public ClientsEvents findById(Long id) {
        return null;
    }

    @Override
    public Boolean deleteById(Long id) {
        return null;
    }

    @Override
    public ClientsEvents editById(Long id, ClientsEventsDto clientsEventsDto) {
        return null;
    }

    @Override
    public ClientsEvents create(ClientsEventsDto clientsEventsDto) {
        return null;
    }
}
