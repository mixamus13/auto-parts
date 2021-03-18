package com.mixamus.autoparts.dto;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PartDtoV1 {

    String namepart;

    String vin;

    int year;
}
