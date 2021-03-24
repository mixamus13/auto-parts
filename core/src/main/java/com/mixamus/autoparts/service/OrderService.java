package com.mixamus.autoparts.service;

import com.mixamus.autoparts.dao.OrderDao;
import com.mixamus.autoparts.domain.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    final OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public List<Order> getAllOrder() {
        return orderDao.findAll();
    }

    public Optional<Order> getOrderById(Integer id) {
        return orderDao.findById(id);
    }

    public Order getOrderName(String name) {
        return orderDao.getByNumberorder(name);
    }

    public void getNewOrder(Order order) {
        orderDao.save(order);
    }

    public void delete(int id) {
        orderDao.deleteById(id);
    }

    public void deleteByName(String numberOrder) {

    }

    public static void updateOrderId(int id, Order order, OrderService orderService) {
//        Order newOrder = new Order();
//        newOrder.setId(id);
//        newOrder.setNumberorder(order.getNumberorder());
//        orderService.getNewOrder(newOrder);
    }
}
