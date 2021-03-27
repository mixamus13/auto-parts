package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.OrderID;
import com.mixamus.autoparts.dto.OrderDto;
import com.mixamus.autoparts.service.OrderIDService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class OrderIDController {

    final OrderIDService orderIDService;

    @GetMapping("/orderid/")
    public List<OrderID> getAllOrder() {
        return orderIDService.getAllOrder();
    }

    @GetMapping("/orderid/{id}")
    public Optional<OrderID> getOrderById(@PathVariable int id) {
        return orderIDService.getOrderById(id);
    }

    @GetMapping("/orderid/numberorder/{numberOrder}")
    public OrderDto getOrderByNumberorder(@PathVariable String numberOrder) {
        OrderID domainOrder = orderIDService.getOrderName(numberOrder);
        OrderDto orderDto = new OrderDto();
        orderDto.setNumberOrder(domainOrder.getNumberorder());
        return orderDto;
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
