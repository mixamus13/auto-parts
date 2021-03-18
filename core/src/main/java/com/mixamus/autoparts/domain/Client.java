package com.mixamus.autoparts.domain;

import lombok.*;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String username;

    String firstname;

    String lastname;

    String password;

    String phone;
}