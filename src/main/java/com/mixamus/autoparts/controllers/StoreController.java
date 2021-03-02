package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.dao.StoreRepository;
import com.mixamus.autoparts.domain.Store;
import org.springframework.web.bind.annotation.*;

@RestController
public class StoreController {

    StoreRepository storeRepository;

    public StoreController(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @GetMapping("store/order/{numberOrder}")
    public Store getByNumberOrder(@PathVariable String numberOrder) {
        return storeRepository.getByName(numberOrder);
    }

    @PostMapping("/store/order")
    public Store getNewOrder() {
        Store newOrder = new Store();
        return storeRepository.create();
    }

    @DeleteMapping("store/order/{numberOrder}")
    public void deleteByNumberOrder(@PathVariable String numberOrder) {
        storeRepository.delete(numberOrder);
    }
}
