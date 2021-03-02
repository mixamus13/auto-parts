package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Store;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class StoreRepository implements RepositoryManipulation<Store> {

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

    private static Map<String, String> indexBuNumberOrder = Map.of(
            "1234356", "1",
            "7785645", "2",
            "5235363", "3",
            "3532453", "4",
            "8566344", "5",
            "9675634", "6",
            "3679633", "7",
            "9754424", "8"
    );

    @Override
    public Store create() {
        Store newOrder = new Store();
        return orders.put("10", newOrder);
    }

    @Override
    public Store update(Store name) {
        return null;
    }

    @Override
    public Store getByName(String name) {
        String key = indexBuNumberOrder.get(name);
        return orders.get(key);
    }

    @Override
    public void delete(String id) {
        orders.remove(id);
    }
}
