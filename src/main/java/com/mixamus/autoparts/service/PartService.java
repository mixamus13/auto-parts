package com.mixamus.autoparts.service;

import com.mixamus.autoparts.dao.PartDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PartService {

    PartDao partDao;
}
