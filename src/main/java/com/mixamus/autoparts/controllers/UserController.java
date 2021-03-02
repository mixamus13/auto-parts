package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.dao.UsersRepository;
import com.mixamus.autoparts.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UsersRepository usersRepository;

    public UserController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("user/{userName}")
    public User getByUsername(@PathVariable String userName) {
        return usersRepository.getByName(userName);
    }

    @PostMapping("user/")
    public User createByUser() {
        return usersRepository.create();
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
