package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.service.CheckOrderNumberService;
import com.mixamus.autoparts.service.OrderIDService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.supercsv.cellprocessor.ParseInt;

import java.util.List;

@RestController
@RequestMapping("check/")
@AllArgsConstructor
public class CheckOrderIDNumber {

    final CheckOrderNumberService checkOrderNumberService;

    @GetMapping("number/")
    public List<Part> getOrderByIdAvailablePart(@RequestParam String numberorder) {
        return checkOrderNumberService.getMissingPartsByOrder(numberorder);
    }
}
