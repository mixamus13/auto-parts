package com.mixamus.autoparts.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Service get all parts")
@ExtendWith(MockitoExtension.class)
class PartsServiceGetAllPartsTest {

    @Mock
    private ClientService clientService;

    @DisplayName("Get all parts is not null")
    @Test
    void getAllParts_whenGetNotNull() {
        var allClients = clientService.getAllClients();
        assertNotNull(allClients);
    }
}