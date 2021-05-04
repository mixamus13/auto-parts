package com.mixamus.autoparts.service;

import com.mixamus.autoparts.dao.CustomDao;
import com.mixamus.autoparts.domain.Part;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomService {

  private final CustomDao customDao;

  public List<Part> getCustomParts() {
    return customDao.getCustomParts();
  }

  public Part getPartById(int id) {
    return customDao.getPartById(id);
  }
}
