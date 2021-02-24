package com.mixamus.autoparts.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Store {

    public static Set setStore = Set.of(
            new Store("1234356", true),
            new Store("7785645", true),
            new Store("5235363", false),
            new Store("3532453", true),
            new Store("8566344", true),
            new Store("9675634", false),
            new Store("3679633", true),
            new Store("9754424", false)
    );

    private String numberOrder;
    private boolean statusOrder;
}
