package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.service.CustomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomController {

    private final CustomService customService;

    @GetMapping("/custom")
    public List<Part> customMethod() {
        return customService.getCustomParts();
    }

    @GetMapping("/custom/{id}")
    public Part getPartById(@PathVariable int id) {
        return customService.getPartById(id);
    }
}
