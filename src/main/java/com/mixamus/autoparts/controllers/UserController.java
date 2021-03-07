package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.service.UsersService;
import com.mixamus.autoparts.domain.User;
import com.mixamus.autoparts.opencsv.CsvUsersRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {






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
