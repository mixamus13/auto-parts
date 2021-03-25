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
public class Part {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    int id;

    String namepart;

    String vin;

    String model;

    int year;

    boolean availability;

    @ManyToMany(mappedBy = "part")
    @JsonIgnore
    private List<OrderID> orderIDS;
}
