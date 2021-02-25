package com.mixamus.autoparts.service;

import com.mixamus.autoparts.dao.StoreDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreService {

    StoreDao storeDao;
}
