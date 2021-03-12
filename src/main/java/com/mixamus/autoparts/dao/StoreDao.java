package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreDao extends JpaRepository<Order, Integer> {

}
