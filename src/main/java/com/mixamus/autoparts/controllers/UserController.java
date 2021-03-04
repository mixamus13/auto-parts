package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.dao.UsersRepository;
import com.mixamus.autoparts.domain.User;
import com.mixamus.autoparts.opencsv.CsvUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UsersRepository usersRepository;
    private final CsvUsersRepository csvUsersRepository;

    @Autowired
    public UserController(UsersRepository usersRepository, CsvUsersRepository csvUsersRepository) {
        this.usersRepository = usersRepository;
        this.csvUsersRepository = csvUsersRepository;
    }

    @GetMapping("user/{id}")
    public List<String> getPartByIdCsv(@PathVariable int id) {
        return csvUsersRepository.getPartCsvId(id);
    }

    @PostMapping("user/")
    public User createByUser(User user) {
        return usersRepository.create(user);
    }

    @PutMapping("user/{userName}")
    public User updateUserByUserName(@PathVariable User userName) {
        return usersRepository.update(userName);
    }

    @DeleteMapping("user/{userName}")
    public void deleteUserByUserName(@PathVariable String userName) {
        usersRepository.delete(userName);
    }
}
