package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client, Integer> {

  //void delete(String userName);
}
