package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.dao.StoreRepository;
import com.mixamus.autoparts.domain.Store;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StoreController {

    StoreRepository storeRepository;

    public StoreController(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @GetMapping("order/{numberOrder}")
    public Store getByNumberOrder(@PathVariable String numberOrder) {
        return storeRepository.getByNumberOrder(numberOrder);
    }
}
