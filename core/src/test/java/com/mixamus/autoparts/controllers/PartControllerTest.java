package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.service.PartsService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PartControllerTest {

    private PartsService partsService;

    @Test
    void getAllParts() {
        assertThat(partsService.getAllParts()).isNotNull();
    }

    @Test
    void getPartById() {
    }

    @Test
    void createPart() {
    }

    @Test
    void updatePartById() {
    }

    @Test
    void deletePartById() {
    }
}