package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.dao.UsersRepository;
import com.mixamus.autoparts.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UsersRepository usersRepository;

    public UserController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("users/")
    public List<User> getAllUsers() {
        return usersRepository.getAllUsers();
    }
}
