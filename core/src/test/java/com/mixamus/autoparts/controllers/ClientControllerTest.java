package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.dao.ClientDao;
import com.mixamus.autoparts.dao.OrderIDDao;
import com.mixamus.autoparts.dao.PartDao;
import com.mixamus.autoparts.domain.Client;
import com.mixamus.autoparts.service.ClientService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

//@SpringBootTest(classes = ClientControllerTest.class) // <--- когда тестируем: service - businesses logic, не используем SpringBootTest
//@ExtendWith(MockitoExtension.class)
@DataJpaTest
class ClientControllerTest {

    // этот бин Создастся моком и он заменит в контексте реальный бин
    @MockBean
    ClientDao clientDao;

    @MockBean
    PartDao partDao;

    @MockBean
    OrderIDDao orderIDDao;

    @InjectMocks // заменяет @BeforeEach, подставятся все моки из этого теста @MockBean
    private ClientService clientService;

    @Test
    @DisplayName("Get all clients on fetch = LAZY")
    public void fetchTypeLoading() {
        List<Client> clients = clientDao.findAll();
    }
}