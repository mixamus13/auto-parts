package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderDao extends JpaRepository<Order, Integer> {

    Order getByNumberorder(String ordername);
}
