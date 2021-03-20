package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Order;
import com.mixamus.autoparts.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class OrderController {

  final OrderService orderService;

  @GetMapping("/orders/")
  public List<Order> getAllOrder() {
    return orderService.getAllOrder();
  }

  @GetMapping("/orders/{id}")
  public Optional<Order> getOrderById(@PathVariable int id) {
    return orderService.getOrderById(id);
  }

  @PostMapping("/orders/")
  public void getNewOrder(@RequestBody Order order) {
    orderService.getNewOrder(order);
  }

  @PutMapping("/orders/{id}")
  public void updateOrder(@PathVariable int id,
                          @RequestBody Order order) {
    Order newOrder = new Order();
    newOrder.setId(id);
    newOrder.setNumberorder(order.getNumberorder());
    newOrder.setStatusorder(order.isStatusorder());
    orderService.getNewOrder(newOrder);
  }

  @DeleteMapping("/orders/{id}")
  public void deleteByNumberOrder(@PathVariable int id) {
    orderService.delete(id);
  }

//    @DeleteMapping("/order/{numberOrder}")
//    public void deleteByNumberOrder(@PathVariable String numberOrder) {
//        storeService.deleteByName(numberOrder);

//    }


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
