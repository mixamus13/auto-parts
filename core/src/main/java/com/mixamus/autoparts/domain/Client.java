package com.mixamus.autoparts.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

//@NamedEntityGraph(name = "graph.clientOrder", attributeNodes = @NamedAttributeNode("order"))
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true )
    @Fetch(FetchMode.SUBSELECT)
    private List<OrderID> orderID = new ArrayList<>();
}
