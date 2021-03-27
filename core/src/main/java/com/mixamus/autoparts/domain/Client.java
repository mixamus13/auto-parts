package com.mixamus.autoparts.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
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

    /**
     *  При использовании связи One-to-Many в аннотации @JoinColumn name будет ссылаться
     *  на Foreign Key не из source, а из target таблицы.
     */
    @JsonIgnore
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderID> orderID = new ArrayList<>();
}
