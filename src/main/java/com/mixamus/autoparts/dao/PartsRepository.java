package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.domain.Store;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class PartsRepository {

    private static Map<String, Part> parts = Map.of(
            "1", new Part(1, "Avtomagnitol", "VW4829489284298492", "Dodge", 1997),
            "2", new Part(2, "Koleso", "GH4829484274888913", "Opel", 2002),
            "3", new Part(3, "Krilo", "SS4878623451888913", "BMW", 2012),
            "4", new Part(4, "Fara", "UU48294842675413956", "Cadilac", 1999),
            "5", new Part(5, "Kapot", "LK4456734274111112", "Audi", 2010),
            "6", new Part(6, "Sidenie", "PO48294843434644", "Jeep", 2016),
            "7", new Part(7, "Kardan", "MN4829484274888913", "Chevrolet", 1987),
            "8", new Part(8, "Provodka", "CX4829484274888913", "Ford", 1876)
    );

    public Part getPartByNamePart(String namePart) {
        return parts.get(namePart);
    }

    public Part createNewPart() {
        Part newPart = new Part();
        return newPart;
    }

    public Part updatePartNamePart(String namePart) {
        return parts.putIfAbsent(namePart, parts.get(namePart));
    }

    public void deletePartById(String namePart) {
        parts.remove(namePart);
    }

    public void uploadImage(String image) {

    }

    public boolean findPartByStatus(String namePart) {
        Store status = new Store();
        return status.isStatusOrder();
    }

//    public static List<Part> parts = List.of(
//            new Part(1, "Avtomagnitol", "VW4829489284298492", "Dodge", 1997),
//            new Part(2, "Koleso", "GH4829484274888913", "Opel", 2002),
//            new Part(3, "Krilo", "SS4878623451888913", "BMW", 2012),
//            new Part(4, "Fara", "UU48294842675413956", "Cadilac", 1999),
//            new Part(5, "Kapot", "LK4456734274111112", "Audi", 2010),
//            new Part(6, "Sidenie", "PO48294843434644", "Jeep", 2016),
//            new Part(7, "Kardan", "MN4829484274888913", "Chevrolet", 1987),
//            new Part(8, "Provodka", "CX4829484274888913", "Ford", 1876)
//    );
}
