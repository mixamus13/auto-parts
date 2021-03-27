package com.mixamus.autoparts.service;

import com.mixamus.autoparts.dao.ClientDao;
import com.mixamus.autoparts.domain.Client;
import com.mixamus.autoparts.dto.ClientDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientService {

    final ClientDao clientDao;

    public List<Client> getAllClients() {
        return clientDao.findAll();
    }

    public Optional<Client> getClientById(int id) {
        return clientDao.findById(id);
    }

    public Client createClient(Client client) {
        return clientDao.save(client);
    }

    public void deleteClientById(int id) {
        clientDao.deleteById(id);
    }

    public void updateClientById(Client userName) {
        clientDao.save(userName);
    }

    public Client findClientByFirstname(String firstName) {
        return clientDao.getClientByFirstname(firstName);
    }

    public void updateClientId(int id, ClientDto clientDto, ClientService clientService) {
        Client newClient = new Client();
        newClient.setId(id);
        newClient.setUsername(clientDto.getUsername());
        newClient.setFirstname(clientDto.getFirstname());
        newClient.setLastname(clientDto.getLastname());
        newClient.setPassword(clientDto.getPassword());
        newClient.setPhone(clientDto.getPhone());
        clientService.updateClientById(newClient);
    }
}
