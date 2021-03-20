package com.mixamus.autoparts.service;

import com.mixamus.autoparts.dao.OrderDao;
import com.mixamus.autoparts.domain.Order;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderService {

  final OrderDao orderDao;

  public List<Order> getAllOrder() {
    return orderDao.findAll();
  }

  public Optional<Order> getOrderById(Integer id) {
    return orderDao.findById(id);
  }

  public Order getByNumberOrder(String numberOrder) {
    return null;
  }

  public void getNewOrder(Order order) {
    orderDao.save(order);
  }

  public void delete(int id) {
    orderDao.deleteById(id);
  }

  public void deleteByName(String numberOrder) {

  }

  public void updateOrderId(int id, Order order) {
//    Order newOrder = new Order();
//    newOrder.setId(id);
//    newOrder.setNumberorder(order.getNumberorder());
//    newOrder.setStatusorder(order.isStatusorder());
//    orderService.getNewOrder(newOrder);
  }


//    private static Map<String, Store> orders = Map.of(
//            "1", new Store(1, "1234356", true),
//            "2", new Store(2, "7785645", true),
//            "3", new Store(3, "5235363", false),
//            "4", new Store(4, "3532453", true),
//            "5", new Store(5, "8566344", true),
//            "6", new Store(6, "9675634", false),
//            "7", new Store(7, "3679633", true),
//            "8", new Store(8, "9754424", false)
//    );
//
//    private static Map<String, String> indexBuNumberOrder = Map.of(
//            "1234356", "1",
//            "7785645", "2",
//            "5235363", "3",
//            "3532453", "4",
//            "8566344", "5",
//            "9675634", "6",
//            "3679633", "7",
//            "9754424", "8"
//    );
//
//    @Override
//    public Store create(Store store) {
//        Store newOrder = new Store();
//        return orders.put("10", newOrder);
//    }
//
//    @Override
//    public Store update(Store name) {
//        return null;
//    }
//
//    @Override
//    public Store getByName(String name) {
//        String key = indexBuNumberOrder.get(name);
//        return orders.get(key);
//    }
//
//    @Override
//    public Store getById(String id) throws ExceptionRepository {
//        return null;
//    }
//
//    @Override
//    public void delete(String id) {
//        orders.remove(id);
//    }
}
