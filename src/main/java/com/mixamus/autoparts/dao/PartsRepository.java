package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.domain.Store;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class PartsRepository implements RepositoryManipulation<Part> {

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

    private static Map<String, String> indexByNamePart = Map.of(
            "Avtomagnitol", "1",
            "Koleso", "2",
            "Krilo", "3",
            "Fara", "4",
            "Kapot", "5",
            "Sidenie", "6",
            "Kardan", "7",
            "Provodka", "8"
    );

    @Override
    public Part create() {
        Part newPart = new Part();
        newPart.setId(newPart.getId());
        newPart.setNamePart(newPart.getNamePart());
        newPart.setVin(newPart.getVin());
        newPart.setModel(newPart.getModel());
        newPart.setYear(newPart.getYear());
        return parts.put("11", newPart);
    }

    @Override
    public Part update(Part namePart) {
        return null;
    }

    @Override
    public Part getByName(String name) {
        String key = indexByNamePart.get(name);
        return parts.get(key);
    }

    @Override
    public void delete(String id) {
        parts.remove(id);
    }

    public void uploadImage(String image) {

    }

    public boolean findPartByStatus(String namePart) {
        Store status = new Store();
        return status.isStatusOrder();
    }
}
