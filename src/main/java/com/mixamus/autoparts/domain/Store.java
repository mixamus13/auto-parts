package com.mixamus.autoparts.domain;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String numberOrder;

    boolean statusOrder;
}
