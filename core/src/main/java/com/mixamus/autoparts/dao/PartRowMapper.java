package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.domain.StatusOrderID;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PartRowMapper implements RowMapper<Part> {
    @Override
    public Part mapRow(ResultSet rs, int rowNum) throws SQLException {
        Part part = new Part();
        part.setId(rs.getInt("id"));
        part.setNamepart(rs.getString("namepart"));
        part.setVin(rs.getString("vin"));
        part.setModel(rs.getString("model"));
        part.setYear(rs.getInt("year"));
        part.setAvailability(StatusOrderID.valueOf(rs.getString("availability")));
        return part;
    }
}
