package com.mixamus.autoparts.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Part {

    int id;
    String namePart;
    String vin;
    String model;
    int year;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;  // reflexive
        if (object == null                // object non null
                || getClass() != object.getClass()) return false;  //
        Part part = (Part) object;
        return year == part.year
                && Objects.equals(namePart, part.namePart)
                && Objects.equals(vin, part.vin)
                && Objects.equals(model, part.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, model, year);
    }
}
