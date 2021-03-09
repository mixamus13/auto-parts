package com.mixamus.autoparts.dto;

import lombok.*;

import javax.persistence.Entity;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class PartDto {

    String namepart;

    String vin;

    String model;

    int year;
}
