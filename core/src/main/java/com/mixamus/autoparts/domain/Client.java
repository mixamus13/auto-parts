package com.mixamus.autoparts.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Client {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    int id;

    String username;

    String firstname;

    String lastname;

    String password;

    String phone;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<OrderID> orderIDS;
}
