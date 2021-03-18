package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.service.CheckOrderNumberService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ResponseStatus
@AllArgsConstructor
public class CheckOrderNumber {

  CheckOrderNumberService orderNumberService;

  @GetMapping
  public List<Part> getMissingPart(@RequestParam String orderId) {
    return null;
  }
}

/**
 * Сделать заказ, получить по номеру заказа, чего нет в наличии.
 * (есть в заказе но нет в наличии.)
 */
