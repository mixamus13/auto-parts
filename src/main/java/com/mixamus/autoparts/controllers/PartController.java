package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.dao.PartsRepository;
import com.mixamus.autoparts.domain.Part;
import org.springframework.web.bind.annotation.*;

@RestController
public class PartController {

    private final PartsRepository partsRepository;

    public PartController(PartsRepository partsRepository) {
        this.partsRepository = partsRepository;
    }

    @GetMapping("part/{namePart}")
    public Part getPartByNamePart(@PathVariable String namePart) {
        return partsRepository.getByName(namePart);
    }

    @GetMapping("/part/find{namePart}")
    public boolean findPartByStatus(@PathVariable String namePart) {
        return partsRepository.findPartByStatus(namePart);
    }

    @PostMapping("part/")
    public Part createNewPart() {
        return partsRepository.create();
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
