package com.mixamus.autoparts.service;

import com.mixamus.autoparts.dao.PartDao;
import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.dto.PartDtoV1;
import com.mixamus.autoparts.dto.PartDtoV2;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class PartsService {

    final PartDao partDao;

    public PartsService(PartDao partDao) {
        this.partDao = partDao;
    }

    public List<Part> getAllParts() {
        return partDao.findAll();
    }

    public Optional<Part> getPartById(int id) {
        return partDao.findById(id);
    }

    public Part createPart(Part part) {
        return partDao.save(part);
    }

    public void updatePartById(Part part) {
        partDao.save(part);
    }

    public void deleteById(int id) {
        partDao.deleteById(id);
    }

    public void uploadImage(String image) {
    }

    public boolean findPartByStatus(String namePart) {
        return false;
    }

    public void updatePartByIdV1(int id, PartDtoV1 partDtoV1, PartsService partsService) {
        Part newPart = new Part();
        newPart.setId(id);
        newPart.setNamepart(partDtoV1.getNamepart());
        newPart.setVin(partDtoV1.getVin());
        newPart.setModel("n/a");
        newPart.setYear(partDtoV1.getYear());
        partsService.updatePartById(newPart);
    }

    public void updatePartByIdV2(int id, PartDtoV2 partDtoV2, PartsService partsService) {
        Part newPart = new Part();
        newPart.setId(id);
        newPart.setNamepart(partDtoV2.getNamepart());
        newPart.setVin(partDtoV2.getVin());
        newPart.setModel(partDtoV2.getModel());
        newPart.setYear(partDtoV2.getYear());
        partsService.updatePartById(newPart);
    }

//    private static Map<String, Part> parts = Map.of(
//            "1", new Part(1, "Avtomagnitol", "VW4829489284298492", "Dodge", 1997),
//            "2", new Part(2, "Koleso", "GH4829484274888913", "Opel", 2002),
//            "3", new Part(3, "Krilo", "SS4878623451888913", "BMW", 2012),
//            "4", new Part(4, "Fara", "UU48294842675413956", "Cadilac", 1999),
//            "5", new Part(5, "Kapot", "LK4456734274111112", "Audi", 2010),
//            "6", new Part(6, "Sidenie", "PO48294843434644", "Jeep", 2016),
//            "7", new Part(7, "Kardan", "MN4829484274888913", "Chevrolet", 1987),
//            "8", new Part(8, "Provodka", "CX4829484274888913", "Ford", 1876)
//    );
//
//    CsvPartsRepository csvPartsRepository;
//
//    @Override
//    public Part create(Part entity) {
//        List<Part> list = new ArrayList();
//        list.add(entity);
//        return entity;
//    }
//
//    @Override
//    public Part update(Part namePart) {
//        return null;
//    }
//
//    @Override
//    public Part getByName(String name) {
//        return parts.get(name);
//    }
//
//    @Override
//    public Part getById(String id) {
//        return parts.get(id);
//    }
//
//    @Override
//    public void delete(String id) {
//        parts.remove(id);
//    }
//
//    public void uploadImage(String image) {
//
//    }
//
//    public boolean findPartByStatus(String namePart) {
//        Store status = new Store();
//        return status.isStatusOrder();
//    }
}
