package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.dao.UsersRepository;
import com.mixamus.autoparts.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UsersRepository usersRepository;

    public UserController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("users/{userName}")
    public User getUserByUserName(@PathVariable String userName) {
        return usersRepository.getByUserName(userName);
    }
}
