package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Part;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PartsRepository {

    public static List<Part> parts = List.of(
            new Part(1, "Avtomagnitol", "VW4829489284298492", "Dodge", 1997),
            new Part(2, "Koleso", "GH4829484274888913", "Opel", 2002),
            new Part(3, "Krilo", "SS4878623451888913", "BMW", 2012),
            new Part(4, "Fara", "UU48294842675413956", "Cadilac", 1999),
            new Part(5, "Kapot", "LK4456734274111112", "Audi", 2010),
            new Part(6, "Sidenie", "PO48294843434644", "Jeep", 2016),
            new Part(7, "Kardan", "MN4829484274888913", "Chevrolet", 1987),
            new Part(8, "Provodka", "CX4829484274888913", "Ford", 1876)
    );

    public List<Part> getAllParts() {
        return parts;
    }
}
