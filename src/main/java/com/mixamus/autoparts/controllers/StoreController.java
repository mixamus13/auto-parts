package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.service.StoreService;
import com.mixamus.autoparts.domain.Store;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class StoreController {







//    StoreService storeService;
//
//    public StoreController(StoreService storeService) {
//        this.storeService = storeService;
//    }
//
//    @GetMapping("store/order/{numberOrder}")
//    public Store getByNumberOrder(@PathVariable String numberOrder) {
//        return storeService.getByName(numberOrder);
//    }
//
//    @PostMapping("/store/order")
//    public Store getNewOrder(Store store) {
//        Store newOrder = new Store();
//        return storeService.create(store);
//    }
//
//    @DeleteMapping("store/order/{numberOrder}")
//    public void deleteByNumberOrder(@PathVariable String numberOrder) {
//        storeService.delete(numberOrder);
//    }
}
