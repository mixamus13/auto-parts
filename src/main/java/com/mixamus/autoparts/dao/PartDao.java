package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Part;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartDao extends JpaRepository<Part, String> {

}
