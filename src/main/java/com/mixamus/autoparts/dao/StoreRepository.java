package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Store;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class StoreRepository {

    private static Map<String, Store> orders = Map.of(
            "1", new Store("1234356", true),
            "2", new Store("7785645", true),
            "3", new Store("5235363", false),
            "4", new Store("3532453", true),
            "5", new Store("8566344", true),
            "6", new Store("9675634", false),
            "7", new Store("3679633", true),
            "8", new Store("9754424", false)
    );

    public Store getByNumberOrder(String numberOrder) {
        return orders.get(numberOrder);
    }

    public void deleteByNumberOrder(String numberOrder) {
        orders.remove(numberOrder);
    }

    public Store getNewOrder() {
        Store newOrder = new Store();
        return orders.put("10", newOrder);
    }

//    public static List<Store> orders = List.of(
//            new Store("1234356", true),
//            new Store("7785645", true),
//            new Store("5235363", false),
//            new Store("3532453", true),
//            new Store("8566344", true),
//            new Store("9675634", false),
//            new Store("3679633", true),
//            new Store("9754424", false)
//    );

}
