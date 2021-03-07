package com.mixamus.autoparts.domain;

import lombok.*;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Part {

    @Id
    @GeneratedValue
    Integer id;

    String namePart;

    String vin;

    String model;

    int year;
}
