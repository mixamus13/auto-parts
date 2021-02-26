package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.dao.PartsRepository;
import com.mixamus.autoparts.domain.Part;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PartController {

    private final PartsRepository partsRepository;

    public PartController(PartsRepository partsRepository) {
        this.partsRepository = partsRepository;
    }

    @GetMapping("parts/")
    public List<Part> getAllParts() {
        return partsRepository.getAllParts();
    }
}
