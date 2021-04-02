package com.mixamus.autoparts.service;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.domain.StatusOrderID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
        if (orderName == null) {
            return null;
        }
        var parts = orderName.getPart();
        return parts.stream()
                .filter(p -> p.getAvailability().equals(StatusOrderID.NON_STOCK))
                .collect(Collectors.toList());
    }
}

/*
        Получить Order,
        получить все его Part (получить по Order Part(s)),
        проверить какие Part есть в наличии,
        вернуть Order с Part что есть в наличии.

*/

/*
OrderID orderName = orderIDService.getOrderName(numberorder);
        if (orderName == null) {
            return null;
        }
var parts = orderName.getPart();
return parts.stream().filter(p -> p.getAvailability().equals(StatusOrderID.NON_STOCK)).collect(Collectors.toList());

var parts = orderIDService.getOrderName(numberorder).getPart();
        List<Part> list = new ArrayList<>();
        for (Part p : parts) {
            if (!p.getAvailability().equals("IN_STOCK")) {
                list.add(p);
            }
        }
        return list;
 */