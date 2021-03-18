package com.mixamus.autoparts.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
