package com.mixamus.autoparts.domain;

import lombok.*;
import org.hibernate.annotations.NaturalId;

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
    private List<Order> orders;
}
