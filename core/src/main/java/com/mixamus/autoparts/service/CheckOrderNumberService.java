package com.mixamus.autoparts.service;

import com.mixamus.autoparts.domain.Part;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CheckOrderNumberService {

    final PartsService partsService;

    public List<Part> getOrderIdAvailable(Integer orderId) {
        List<Part> listParts = new ArrayList<>();
        var partIsPresentOder = partsService.getPartById(orderId);
        partIsPresentOder.ifPresent(
                part -> {
                    if (partIsPresentOder.get().isAvailability()) {
                        listParts.add(partIsPresentOder.get());
                    }
                }
        );

        return listParts;
    }

    public List<Part> getPartsAvailable() {
        List<Part> allParts = partsService.getAllParts();
        return allParts.stream().filter(Part::isAvailability).collect(Collectors.toList());
    }
}
