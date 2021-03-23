package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Order;
import com.mixamus.autoparts.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders/")
    public List<Order> getAllOrder() {
        return orderService.getAllOrder();
    }

    @GetMapping("/orders/{id}")
    public Optional<Order> getOrderById(@PathVariable int id) {
        return orderService.getOrderById(id);
    }

    @GetMapping("/orders/numberorder/{numberOrder}")
    public Order getOrderByNumberorder(@PathVariable String numberOrder) {
        return  orderService.getOrderName(numberOrder);
    }

    @PostMapping("/orders/")
    @ResponseStatus(HttpStatus.CREATED)
    public void getNewOrder(@RequestBody Order order) {
        orderService.getNewOrder(order);
    }

    @PutMapping("/orders/{id}")
    public void updateOrder(@PathVariable int id,
                            @RequestBody Order order) {
        OrderService.updateOrderId(id, order, orderService);
    }

    @DeleteMapping("/orders/{id}")
    public void deleteByNumberOrder(@PathVariable int id) {
        orderService.delete(id);
    }
}
