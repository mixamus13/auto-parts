package com.mixamus.autoparts.service;

import com.mixamus.autoparts.domain.Client;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Client service get by Id")
@ExtendWith(MockitoExtension.class)
class ClientServiceGetById {

    @Mock
    private ClientService clientService;

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
        assertEquals(Optional.empty(), clientService.getClientById(123));
    }

    @Test
    @DisplayName("Get client is correct param")
    void shouldClientHappyPass() {
        Client client = new Client();
        client.setId(13);

        assertEquals(13, client.getId());
    }
}