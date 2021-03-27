package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.OrderID;
import com.mixamus.autoparts.domain.Part;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartDao extends JpaRepository<Part, Integer> {

}
