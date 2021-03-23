package com.mixamus.autoparts.service;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.exceptions.OrderNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CheckOrderNumberService {

    final PartsService partsService;
    final OrderService orderService;

    public CheckOrderNumberService(PartsService partsService, OrderService orderService) {
        this.partsService = partsService;
        this.orderService = orderService;
    }

    /**
     * @param orderId number of order.
     * @return order has part is available.
     */
    public List<Part> getOrderIdMissing(String orderId) {
        var maybeOrder = orderService.getOrderName(orderId);
        List<Part> allParts;
        if (maybeOrder.isStatusorder()) {
            allParts = partsService.getAllParts().stream().filter(Part::isAvailability).collect(Collectors.toList());
        } else {
            throw new OrderNotFoundException(orderId);
        }
        return allParts;
    }

    /**
     * @return all parts available.
     */
    public List<Part> getPartsAvailable() {
        List<Part> allParts = partsService.getAllParts();
        List<Part> list = new ArrayList<>();
        for (Part allPart : allParts) {
            if (allPart.isAvailability()) {
                list.add(allPart);
            }
        }
        return list;
    }
}
