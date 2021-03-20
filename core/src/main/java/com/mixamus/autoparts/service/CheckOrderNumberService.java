package com.mixamus.autoparts.service;

import com.mixamus.autoparts.domain.Part;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CheckOrderNumberService {

  final PartsService partsService;

  /**
   * Get parts which are available.
   * @return parts that are stock.
   */
  public List<Part> getPartsIsPresent() {
    List<Part> parts = new ArrayList<>();
    List<Part> allParts = partsService.getAllParts();
    for (Part p : allParts) {
      if (p.isAvailability()) {
        parts.add(p);
      }
    }
    return parts;
  }
}
