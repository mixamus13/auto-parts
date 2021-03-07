package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreDao extends JpaRepository<Store, Integer> {

}
