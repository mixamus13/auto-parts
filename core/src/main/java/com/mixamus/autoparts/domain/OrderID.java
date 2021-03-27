package com.mixamus.autoparts.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class OrderID {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    int id;

    String numberorder;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Part> part = new ArrayList<>();

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;
}
