package com.mixamus.autoparts.dto;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class UserDto {

    String userName;

    String firstName;

    String lastName;

    String password;

    String phone;
}