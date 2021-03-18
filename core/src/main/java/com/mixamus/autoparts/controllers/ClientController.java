package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Client;
import com.mixamus.autoparts.dto.ClientDto;
import com.mixamus.autoparts.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class ClientController {

    final ClientService clientService;

    @GetMapping("/clients/")
    public List<Client> allClients() {
        return clientService.getAllUsers();
    }

    @GetMapping("/clients/{id}")
    public Optional<Client> getClientById(@PathVariable int id) {
        return clientService.getClientById(id);
    }

    @PostMapping("/clients/")
    public Client createByClient(@RequestBody Client user) {
        return clientService.createClient(user);
    }

    @PutMapping("/clients/{id}")
    public void updateClientById(@PathVariable int id, @RequestBody ClientDto clientDto) {
        Client newClient = new Client();
        newClient.setId(id);
        newClient.setUsername(clientDto.getUsername());
        newClient.setFirstname(clientDto.getFirstname());
        newClient.setLastname(clientDto.getLastname());
        newClient.setPassword(clientDto.getPassword());
        newClient.setPhone(clientDto.getPhone());
        clientService.updateClientById(newClient);
    }

//    @PutMapping("/clients/{userName}")
//    public Client updateClientByUsername(@PathVariable Client userName) {
//        return null;
//    }

    @DeleteMapping("/clients/{id}")
    public void deleteClientById(@PathVariable int id) {
        clientService.deleteClientById(id);
    }

//    @DeleteMapping("user/{userName}")
//    public void deleteUserByUserName(@PathVariable String userName) {
//        usersService.deleteByUsername(userName);

//    }


//    private final UsersService usersService;
//    private final CsvUsersRepository csvUsersRepository;
//
//    @Autowired
//    public UserController(UsersService usersService, CsvUsersRepository csvUsersRepository) {
//        this.usersService = usersService;
//        this.csvUsersRepository = csvUsersRepository;
//    }
//
//    @GetMapping("user/{id}")
//    public List<String> getPartByIdCsv(@PathVariable int id) {
//        return csvUsersRepository.getPartCsvId(id);
//    }
//
//    @PostMapping("user/")
//    public User createByUser(User user) {
//        return usersService.create(user);
//    }
//
//    @PutMapping("user/{userName}")
//    public User updateUserByUserName(@PathVariable User userName) {
//        return usersService.update(userName);
//    }
//
//    @DeleteMapping("user/{userName}")
//    public void deleteUserByUserName(@PathVariable String userName) {
//        usersService.delete(userName);
//    }
}
