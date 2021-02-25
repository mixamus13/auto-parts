package com.mixamus.autoparts.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Store {

    String numberOrder;
    boolean statusOrder;
}
