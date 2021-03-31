package com.mixamus.autoparts.dto;

import com.mixamus.autoparts.domain.StatusOrderID;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PartDtoV2 {

    @Column(name = "namepart")
    String namepart;

    @Column(name = "vin")
    String vin;

    @Column(name = "model")
    String model;

    @Column(name = "year")
    int year;

    @Enumerated(EnumType.STRING)
    @Column(name = "availability", length = 9)
    StatusOrderID availability;
}
