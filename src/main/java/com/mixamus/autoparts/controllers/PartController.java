package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.dao.PartsRepository;
import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.opencsv.CsvPartsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PartController {

    private final PartsRepository partsRepository;
    private final CsvPartsRepository csvPartsRepository;

    @Autowired
    public PartController(PartsRepository partsRepository, CsvPartsRepository csvPartsRepository) {
        this.partsRepository = partsRepository;
        this.csvPartsRepository = csvPartsRepository;
    }

    /**
     * Get part from id.
     * @param id number of part.
     * @return part with all data.
     */
    @GetMapping("part/{id}")
    public List<String> getPartByIdCsv(@PathVariable int id) {
        return csvPartsRepository.getPartCsvId(id);
    }

    @GetMapping("/part/find{namePart}")
    public boolean findPartByStatus(@PathVariable String namePart) {
        return partsRepository.findPartByStatus(namePart);
    }

    @PostMapping("part/")
    public Part createNewPart(Part part) {
        return partsRepository.create(part);
    }

    @PostMapping("part/{namePart}/uploadImage")
    public void uploadImage(@PathVariable String image) {
        partsRepository.uploadImage(image);
    }

    @PutMapping("part/{namePart}")
    public Part updatePartNamePart(@PathVariable Part namePart) {
        return partsRepository.update(namePart);
    }

    @DeleteMapping("part/{namePart}")
    public void deletePart(@PathVariable String namePart) {
        partsRepository.delete(namePart);
    }
}
