package com.mixamus.autoparts.dto;

import lombok.*;

import javax.persistence.Column;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PartDtoV1 {

  @Column(name = "namepart")
  String namepart;

  @Column(name = "vin")
  String vin;

  @Column(name = "year")
  int year;
}
