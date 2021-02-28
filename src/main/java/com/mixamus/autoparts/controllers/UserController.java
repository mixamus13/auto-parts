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
    public User getUserByUserName(@PathVariable String userName) {
        return usersRepository.getByUserName(userName);
    }

    @PostMapping("user/")
    public User createByUser() {
        return usersRepository.createUser();
    }

    @PutMapping("user/{userName}")
    public User updateUserByUserName(@PathVariable String userName) {
        return usersRepository.updateUserByUserName(userName);
    }

    @DeleteMapping("user/{userName}")
    public void deleteUserByUserName(@PathVariable String userName) {
        usersRepository.deleteByUserName(userName);
    }
}
