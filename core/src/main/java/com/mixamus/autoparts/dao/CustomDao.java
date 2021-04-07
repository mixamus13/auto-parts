package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Part;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CustomDao {

    private final JdbcTemplate jdbcTemplate;

    public List<Part> getCustomParts() {
        return namedParameterJdbcTemplate.query("select * from Part", new BeanPropertyRowMapper<>(Part.class));
    }

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public Part getPartById(int id) {
        SqlParameterSource parameters = new MapSqlParameterSource("id", id);
        return namedParameterJdbcTemplate.queryForObject(
                "SELECT * FROM Part WHERE id=:id", parameters,
                (rs, rowNum) -> new Part(
                        rs.getInt("id"),
                        rs.getString("namepart"),
                        rs.getString("vin"),
                        rs.getString("model"),
                        rs.getInt("year"),
                        rs.getString("availability")));
    }
}