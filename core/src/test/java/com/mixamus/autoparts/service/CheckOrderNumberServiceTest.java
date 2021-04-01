package com.mixamus.autoparts.service;

import com.mixamus.autoparts.domain.OrderID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class CheckOrderNumberServiceTest {

    private CheckOrderNumberService it;

    @Mock
    private OrderIDService orderIDService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        it = new CheckOrderNumberService(orderIDService);
    }

    @Test
    void itWorksWithOrderNull() {
        it.getMissingPartsByOrder("123");
    }

    @Test
    void itWorksWithOrder() {
        when(orderIDService.getOrderName("11134466775"))
                .thenReturn(new OrderID());

        it.getMissingPartsByOrder("11134466775");
    }

}

// протестировать Part in Order все в наличие, какие не в наличии,