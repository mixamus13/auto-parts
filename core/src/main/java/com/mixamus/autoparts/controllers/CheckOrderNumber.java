package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.service.CheckOrderNumberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("check/")
public class CheckOrderNumber {

    final CheckOrderNumberService checkOrderNumberService;

    public CheckOrderNumber(CheckOrderNumberService checkOrderNumberService) {
        this.checkOrderNumberService = checkOrderNumberService;
    }

    @GetMapping("number/")
    public List<Part> getOrderByIdAvailablePart(@RequestParam String orderId) {
        return checkOrderNumberService.getOrderIdMissing(orderId);
    }

    @GetMapping("available/")
    public List<Part> getAllPartsAvailable() {
        return checkOrderNumberService.getPartsAvailable();
    }

    @GetMapping("orderstatus/")
    public List<Part> getOrderAvailable(@RequestParam String ordernumber) {
        return null;
    }
}

/*
  Сделать заказ, получить по номеру заказа, чего нет в наличии.
  (есть в заказе но нет в наличии.)
 */
