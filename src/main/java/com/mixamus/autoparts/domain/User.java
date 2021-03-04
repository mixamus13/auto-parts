package com.mixamus.autoparts.domain;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class User {

    int id;
    String userName;
    String firstName;
    String lastName;
    String password;
    String phone;
}