package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StoreDao extends JpaRepository<Order, Integer> {

}
