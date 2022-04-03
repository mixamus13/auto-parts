package com.mixamus.autoparts.service;

import static com.mixamus.autoparts.domain.StatusOrderID.NON_STOCK;
import static java.util.stream.Collectors.toList;

import com.mixamus.autoparts.domain.Part;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CheckOrderNumberService {

    private final OrderIDService orderIDService;

    /**
     * Returns the parts of the order that are in stock.
     *
     * @param numberorder number order.
     * @return parts is available.
     */
    public List<Part> getMissingPartsByOrder(String numberorder) {
        var orderName = orderIDService.getOrderName(numberorder);
        if (orderName == null) return null;
        var parts = orderName.getPart();
        return parts.stream()
            .filter(p -> p.getAvailability().equals(NON_STOCK))
            .collect(toList());
    }
}
