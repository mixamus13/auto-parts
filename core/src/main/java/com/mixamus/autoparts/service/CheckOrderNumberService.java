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
        return null;
    }

    /**
     * @return all parts available.
     */
    public List<Part> getPartsAvailable() {

        return null;
    }
}
