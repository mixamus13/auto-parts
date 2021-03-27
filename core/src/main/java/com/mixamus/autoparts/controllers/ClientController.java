package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Client;
import com.mixamus.autoparts.dto.ClientDto;
import com.mixamus.autoparts.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class ClientController {

    final ClientService clientService;

    @GetMapping("/clients/")
    public List<Client> allClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/clients/{firstName}")
    public Client updateClientByUsername(@PathVariable String firstName) {
        return clientService.findClientByFirstname(firstName);
    }

    @GetMapping("/clients/clientid/{id}")
    public Optional<Client> getClientById(@PathVariable int id) {
        return clientService.getClientById(id);
    }

    @PostMapping("/clients/")
    @ResponseStatus(HttpStatus.CREATED)
    public Client createNewClient(@RequestBody Client user) {
        return clientService.createClient(user);
    }

    @PutMapping("/clients/{id}")
    public void updateClientById(@PathVariable int id, @RequestBody ClientDto clientDto) {
        clientService.updateClientId(id, clientDto, clientService);
    }

    @DeleteMapping("/clients/{id}")
    public void deleteClientById(@PathVariable int id) {
        clientService.deleteClientById(id);
    }
}
