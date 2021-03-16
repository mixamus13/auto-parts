package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Store;
import com.mixamus.autoparts.service.StoreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class StoreController {

    final StoreService storeService;

    @GetMapping("/order/")
    public List<Store> getAllOrder() {
        return storeService.getAllOrder();
    }

    @GetMapping("/order/{id}")
    public Optional<Store> getOrderById(@PathVariable int id) {
        return storeService.getOrderById(id);
    }

    @PostMapping("/order/")
    public void getNewOrder(@RequestBody Store store) {
        storeService.getNewOrder(store);
    }

    @PutMapping("/order/{id}")
    public void updateOrder(@PathVariable int id,
                            @RequestBody Store store) {
        Store newStore = new Store();
        newStore.setId(id);
        newStore.setNumberorder(store.getNumberorder());
        newStore.setStatusorder(store.isStatusorder());
        storeService.getNewOrder(newStore);
    }

//    @DeleteMapping("/order/{numberOrder}")
//    public void deleteByNumberOrder(@PathVariable String numberOrder) {
//        storeService.deleteByName(numberOrder);
//    }

    @DeleteMapping("/order/{id}")
    public void deleteByNumberOrder(@PathVariable int id) {
        storeService.delete(id);
    }


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
