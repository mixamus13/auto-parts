package com.mixamus.autoparts.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.openMocks;

@DisplayName("Client service get by Id")
@ExtendWith(MockitoExtension.class) // (1) Сообщает Mockito о создании макетов на основе аннотации @Mock.
class ClientServiceGetById {

    @Mock  // Сообщает Mockito mock над экземпляром clientService
    private ClientService clientService;

    @BeforeEach
    void setUp() {
        openMocks(clientService);
    }

    @DisplayName("Check client by ID is null")
    @Test
    void shouldClientByIdIsNotNull() {
        assertNotNull(clientService.getClientById(45));
    }

    @Test
    @DisplayName("Get client is empty param")
    void shouldClientEmptyParam() {
        assertEquals(Optional.empty(), clientService.getClientById(123));
    }

    @Test
    @DisplayName("Get client is incorrect param")
    void shouldClientIncorrectParam() {

        var id = clientService.getClientById(13);
        assertNotEquals(13, id);
    }

    @Test
    @DisplayName("Get client is once time")
    void shouldClientOnceTime() {

        verify(clientService, times(1)).getClientById(12);
    }
}