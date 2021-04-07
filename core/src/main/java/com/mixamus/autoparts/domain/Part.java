package com.mixamus.autoparts.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@TypeDef(name = "pgsql_enum", typeClass = PostgreSQLEnumType.class)
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    int id;

    @Column(name = "namepart")
    String namepart;

    @Column(name = "vin")
    String vin;

    @Column(name = "model")
    String model;

    @Column(name = "year")
    int year;

    @Enumerated(EnumType.STRING)
    @Column(name = "availability")
    @Type(type = "pgsql_enum")
    StatusOrderID availability;

    @JsonIgnore
    @ManyToMany(mappedBy = "part", cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH
    })
    private List<OrderID> orderID = new ArrayList<>();

    public Part(int id, String namepart, String vin, String model, int year, String availability) {
        this.id = id;
        this.namepart = namepart;
        this.vin = vin;
        this.model = model;
        this.year = year;
        this.availability = StatusOrderID.valueOf(availability);
    }
}
/*
    Аннотация @JoinColumn указывает на столбец, который осуществляет связь с другим объектом.

    Cascade операций – это выполнение операции не только для Entity, на котором операция вызывается,
    но и на связанных с ним Entity
 */