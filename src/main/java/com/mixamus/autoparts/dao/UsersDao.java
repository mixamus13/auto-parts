package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDao extends JpaRepository<User, String> {
}
