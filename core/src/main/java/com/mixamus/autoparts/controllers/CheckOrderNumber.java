package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.service.CheckOrderNumberService;
import com.mixamus.autoparts.service.PartsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CheckOrderNumber {

    final PartsService partsService;

    CheckOrderNumberService checkOrderNumberService;

    @Autowired
    public void setCheckOrderNumberService(CheckOrderNumberService checkOrderNumberService) {
        this.checkOrderNumberService = checkOrderNumberService;
    }

    @GetMapping("/ordernumber/")
    public List<Part> getOrderByIdAvailablePart(@RequestParam Integer orderId) {

        return checkOrderNumberService.getOrderIdAvailable(orderId);
    }

    @GetMapping("/orderavailable/")
    public List<Part> getAllPartsAvailable() {
        return checkOrderNumberService.getPartsAvailable();
    }
}

/**
 * Сделать заказ, получить по номеру заказа, чего нет в наличии.
 * (есть в заказе но нет в наличии.)
 * <p>
 * List<Part> rslt = new ArrayList<>();
 * var maybeOrder = orderService.getOrderById(orderId);
 * if (maybeOrder.isPresent()) {
 * var order = maybeOrder.get();
 * List<Integer> partIds = order.getPartIds();
 * for (Integer partId : partIds) {
 * Part partInStore = partsService.getPartById(partId);
 * if (partInStore.getStatus() == Status.NOT_IN_STORE) {
 * rslt.add(PartInStore);
 * }
 * }
 * }
 * return rslt;
 */
