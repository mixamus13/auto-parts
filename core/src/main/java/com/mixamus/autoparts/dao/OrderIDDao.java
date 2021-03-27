package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Client;
import com.mixamus.autoparts.domain.OrderID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderIDDao extends JpaRepository<OrderID, Integer> {

    OrderID getByNumberorder(String ordername);
}
