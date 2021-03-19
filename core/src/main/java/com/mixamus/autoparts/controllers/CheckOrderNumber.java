package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.service.PartsService;
import com.mixamus.autoparts.service.StoreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class CheckOrderNumber {

  StoreService storeService;
  PartsService partsService;

  @GetMapping("/ordernumber/")
  public List<Part> getMissingPart(@RequestParam int orderId) {
//    List<Part> rslt = new ArrayList<>();
//    var maybeOrder = storeService.getOrderById(orderId);
//    if (maybeOrder.isPresent()) {
//      var order = maybeOrder.get();
//      List <Integer> partIds = order.getPartIds();
//      for (Integer partId : partIds) {
//        Part partInStore = partsService.getPartById(partId);
//        if (partInStore.getStatus() == Status.NOT_IN_STORE) {
//          rslt.add(PartInStore);
//        }
//      }
//    }
//    return rslt;
//
//    List<Part> service = partsService.getAllParts();
//
//    return service;
    return null;
  }
}

/**
 * Сделать заказ, получить по номеру заказа, чего нет в наличии.
 * (есть в заказе но нет в наличии.)
 */
