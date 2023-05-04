package service;

import model.Client;
import model.dto.ClientDto;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    List<Client> listAll ();
    Optional<Client> findById(Long id);

    Boolean deleteById(Long id);

    Client edit(Long id, ClientDto clientDto);

    Client createClient(ClientDto clientDto);


}
