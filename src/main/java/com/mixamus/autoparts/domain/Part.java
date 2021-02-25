package com.mixamus.autoparts.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Part {

    int id;
    String namePart;
    String vin;
    String model;
    int year;
}
