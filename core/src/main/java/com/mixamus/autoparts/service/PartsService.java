package com.mixamus.autoparts.service;

import com.mixamus.autoparts.dao.PartDao;
import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.dto.PartDtoV1;
import com.mixamus.autoparts.dto.PartDtoV2;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class PartsService {

    private final PartDao partDao;

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
        newPart.setAvailability(partDtoV2.getAvailability());
        partsService.updatePartById(newPart);
    }
}
