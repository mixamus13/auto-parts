package com.mixamus.autoparts.service;

import com.mixamus.autoparts.dao.OrderIDDao;
import com.mixamus.autoparts.domain.OrderID;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderIDService {

    final OrderIDDao orderIDDao;

    public OrderIDService(OrderIDDao orderIDDao) {
        this.orderIDDao = orderIDDao;
    }

    public List<OrderID> getAllOrder() {
        return orderIDDao.findAll();
    }

    public Optional<OrderID> getOrderById(Integer id) {
        return orderIDDao.findById(id);
    }

    public OrderID getOrderName(String name) {
        return orderIDDao.getByNumberorder(name);
    }

    public void getNewOrder(OrderID orderID) {
        orderIDDao.save(orderID);
    }

    public void delete(int id) {
        orderIDDao.deleteById(id);
    }

    public void deleteByName(String numberOrder) {

    }

    public static void updateOrderId(int id, OrderID orderID, OrderIDService orderIDService) {
        OrderID newOrderID = new OrderID();
        newOrderID.setId(id);
        newOrderID.setNumberorder(orderID.getNumberorder());
        orderIDService.getNewOrder(newOrderID);
    }
}
