package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientDao extends JpaRepository<Client, Integer>, JpaSpecificationExecutor<Client> {

    //@Query(value = "select orderid from OrderID orderid inner join fetch orderid.part") --- join fetch
    Client getClientByFirstname(String firstname);
}
