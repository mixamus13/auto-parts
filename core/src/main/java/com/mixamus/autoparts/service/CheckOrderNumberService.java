package com.mixamus.autoparts.service;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.domain.StatusOrderID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CheckOrderNumberService {

    private final OrderIDService orderIDService;
    private StatusOrderID statusOrderID;

    /**
     * Returns the parts of the order that are in stock.
     *
     * @param numberorder number order.
     * @return parts is available.
     */
    public List<Part> getMissingPartsByOrder(String numberorder) {
        var parts = orderIDService.getOrderName(numberorder).getPart();
        List<Part> list = new ArrayList<>();
        for (Part p : parts) {
            if (!p.getAvailability().equals("IN_STOCK")) {
                list.add(p);
            }
        }
        return list;
    }
}

/*
        Получить Order,
        получить все его Part (получить по Order Part(s)),
        проверить какие Part есть в наличии,
        вернуть Order с Part что есть в наличии.
        =======================================
        ==========    new task   ==============
        =======================================
        вернуть запчасти заказа которых нет в наличии
        =======================================
        сделать Enum IN_STOCK и в DB в таблице переделать
*/

/*
var parts = orderIDService.getOrderName(numberorder).getPart();
return parts.stream().filter(Part::isAvailability).collect(Collectors.toList());

List<Part> partAvailableOrder = new ArrayList<>();
        var parts = orderIDService.getOrderName(numberorder).getPart();
        for (Part p : parts) {
            if (p.isAvailability()) {
                partAvailableOrder.add(p);
            }
        }
        return partAvailableOrder;
 */