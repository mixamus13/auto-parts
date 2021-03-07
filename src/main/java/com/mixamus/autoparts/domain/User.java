package com.mixamus.autoparts.domain;

import lombok.*;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class User {

    @Id
    @GeneratedValue
    Integer id;

    String userName;

    String firstName;

    String lastName;

    String password;

    String phone;
}