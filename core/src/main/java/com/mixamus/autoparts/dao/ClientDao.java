package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientDao extends JpaRepository<Client, Integer>, JpaSpecificationExecutor<Client> {

    Client getClientByFirstname(String firstname);
}
