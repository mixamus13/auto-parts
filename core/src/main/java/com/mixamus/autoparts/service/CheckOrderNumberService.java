package com.mixamus.autoparts.service;

import com.mixamus.autoparts.domain.Part;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CheckOrderNumberService {

    final OrderIDService orderIDService;

    /**
     * Returns the parts of the order that are in stock.
     *
     * @param numberorder number order.
     * @return parts is available.
     */
    public List<Part> getMissingPartsByOrder(String numberorder) {
        var parts = orderIDService.getOrderName(numberorder).getPart();
        return parts.stream().filter(Part::isAvailability).collect(Collectors.toList());
    }
}

/*
        Получить Order,
        получить все его Part (получить по Order Part(s)),
        проверить какие Part есть в наличии,
        вернуть Order с Part что есть в наличии.
*/

/*
public List<Part> getMissingPartsByOrder(String numberorder) {
        List<Part> partAvailableOrder = new ArrayList<>();
        var parts = orderIDService.getOrderName(numberorder).getPart();
        for (Part p : parts) {
            if (p.isAvailability()) {
                partAvailableOrder.add(p);
            }
        }
        return partAvailableOrder;
    }
 */