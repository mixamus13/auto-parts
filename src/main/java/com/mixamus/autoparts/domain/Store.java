package com.mixamus.autoparts.domain;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Store {

    int id;
    String numberOrder;
    boolean statusOrder;
}
