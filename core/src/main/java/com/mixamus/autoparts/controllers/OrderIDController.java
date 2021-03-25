package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.OrderID;
import com.mixamus.autoparts.service.OrderIDService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderIDController {

    final OrderIDService orderIDService;

    public OrderIDController(OrderIDService orderIDService) {
        this.orderIDService = orderIDService;
    }

    @GetMapping("/orderid/")
    public List<OrderID> getAllOrder() {
        return orderIDService.getAllOrder();
    }

    @GetMapping("/orderid/{id}")
    public Optional<OrderID> getOrderById(@PathVariable int id) {
        return orderIDService.getOrderById(id);
    }

    @GetMapping("/orderid/numberorder/{numberOrder}")
    public OrderID getOrderByNumberorder(@PathVariable String numberOrder) {
        return  orderIDService.getOrderName(numberOrder);
    }

    @PostMapping("/orderid/")
    @ResponseStatus(HttpStatus.CREATED)
    public void getNewOrder(@RequestBody OrderID orderID) {
        orderIDService.getNewOrder(orderID);
    }

    @PutMapping("/orderid/{id}")
    public void updateOrder(@PathVariable int id,
                            @RequestBody OrderID orderID) {
        OrderIDService.updateOrderId(id, orderID, orderIDService);
    }

    @DeleteMapping("/orderid/{id}")
    public void deleteByNumberOrder(@PathVariable int id) {
        orderIDService.delete(id);
    }
}
