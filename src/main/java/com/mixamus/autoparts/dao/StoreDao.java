package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreDao extends JpaRepository<Store, String> {

}
