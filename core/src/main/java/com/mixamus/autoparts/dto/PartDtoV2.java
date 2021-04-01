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

    String namepart;

    String vin;

    String model;

    int year;

    StatusOrderID availability;
}
