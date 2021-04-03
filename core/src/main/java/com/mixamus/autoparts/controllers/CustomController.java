package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.dao.CustomDao;
import com.mixamus.autoparts.domain.Part;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomController {

    private final CustomDao customDao;

    @GetMapping("/custom")
    public List<Part> customMethod() {
        return customDao.getCustomParts();
    }
}
