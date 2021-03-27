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

    @JsonIgnore
    @ManyToMany(mappedBy = "part")
    private List<OrderID> orderID = new ArrayList<>();

}
/*
    Аннотация @JoinColumn указывает на столбец, который осуществляет связь с другим объектом.

    Cascade операций – это выполнение операции не только для Entity, на котором операция вызывается,
    но и на связанных с ним Entity
 */