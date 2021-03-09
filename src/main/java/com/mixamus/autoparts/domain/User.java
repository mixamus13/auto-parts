package com.mixamus.autoparts.domain;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String userName;

    String firstName;

    String lastName;

    String password;

    String phone;
}