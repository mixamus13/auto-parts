package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.dao.PartsRepository;
import com.mixamus.autoparts.domain.Part;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartController {

    private final PartsRepository partsRepository;

    public PartController(PartsRepository partsRepository) {
        this.partsRepository = partsRepository;
    }

    @GetMapping("part/{id}")
    public Part getPartById(@PathVariable int id) {
        return partsRepository.getPartById(id);
    }
}
