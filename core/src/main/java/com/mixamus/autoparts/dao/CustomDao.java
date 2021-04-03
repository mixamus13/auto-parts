package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Part;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CustomDao {

    private final JdbcTemplate jdbcTemplate;

    public List<Part> getCustomParts() {
        return jdbcTemplate.query("select * from Part", new BeanPropertyRowMapper<>(Part.class));
    }
}
