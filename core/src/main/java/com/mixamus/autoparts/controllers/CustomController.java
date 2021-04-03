package com.mixamus.autoparts.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomController {

    @GetMapping("/custom")
    public String customMethod() {
        return "custom";
    }
}
