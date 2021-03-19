package com.mixamus.autoparts.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class OrderItem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;

//  @OneToMany(mappedBy = "part")
//  List<Part> parts;

  int count;
}
