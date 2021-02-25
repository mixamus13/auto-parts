package com.mixamus.autoparts.repository;

import com.mixamus.autoparts.domain.Store;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@EnableJpaRepositories
public class StoreRepository {

    public static Set setStore = Set.of(
            new Store("1234356", true),
            new Store("7785645", true),
            new Store("5235363", false),
            new Store("3532453", true),
            new Store("8566344", true),
            new Store("9675634", false),
            new Store("3679633", true),
            new Store("9754424", false)
    );
}
