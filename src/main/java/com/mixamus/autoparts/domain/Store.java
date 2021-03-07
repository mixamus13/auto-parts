package com.mixamus.autoparts.domain;

import lombok.*;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String numberOrder;

    boolean statusOrder;
}
