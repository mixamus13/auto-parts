package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Client;
import com.mixamus.autoparts.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class ClientController {

    final ClientService clientService;

    @GetMapping("clients/")
    public List<Client> allUsers() {
        return clientService.getAllUsers();
    }

    @GetMapping("clients/{id}")
    public Optional<Client> getUserById(@PathVariable int id) {
        return clientService.getUserById(id);
    }

    @PostMapping("clients/")
    public Client createByUser(Client user) {
        return clientService.createByUser(user);
    }

    @PutMapping("clients/{userName}")
    public Client updateUserByUsername(@PathVariable Client userName) {
        return null;
    }

//    @DeleteMapping("user/{userName}")
//    public void deleteUserByUserName(@PathVariable String userName) {
//        usersService.deleteByUsername(userName);
//    }

    @DeleteMapping("clients/{id}")
    public void deleteUserById(@PathVariable int id) {
        clientService.deleteUserById(id);
    }


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
