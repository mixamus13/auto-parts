package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.service.CheckOrderNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("check/")
@RequiredArgsConstructor
public class CheckOrderIDNumber {

    private final CheckOrderNumberService checkOrderNumberService;

    @GetMapping("number/")
    public List<Part> getOrderByIdAvailablePart(@RequestParam String numberorder) {
        return checkOrderNumberService.getMissingPartsByOrder(numberorder);
    }
}
