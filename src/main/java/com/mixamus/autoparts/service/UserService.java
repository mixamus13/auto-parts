package com.mixamus.autoparts.service;

import com.mixamus.autoparts.dao.UsersDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    UsersDao usersDao;
}
