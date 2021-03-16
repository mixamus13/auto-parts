package com.mixamus.autoparts.domain;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String namepart;

    String vin;

    String model;

    int year;
}
