package com.mixamus.autoparts.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class User {

    int id;
    String username;
    String firstName;
    String lastName;
    String password;
    String phone;
    boolean userStatus;
}