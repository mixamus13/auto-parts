package com.mixamus.autoparts.service;

import com.mixamus.autoparts.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckOrderNumberService {

    final PartsService partsService;
    final OrderIDService orderIDService;

    @Autowired
    public CheckOrderNumberService(PartsService partsService, OrderIDService orderIDService) {
        this.partsService = partsService;
        this.orderIDService = orderIDService;
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
