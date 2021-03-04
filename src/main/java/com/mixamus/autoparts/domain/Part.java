package com.mixamus.autoparts.domain;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Part {

    int id;
    String namePart;
    String vin;
    String model;
    int year;
}
