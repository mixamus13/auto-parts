package com.mixamus.autoparts.service;

import com.mixamus.autoparts.domain.OrderID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

@ExtendWith(MockitoExtension.class)
public class CheckOrderNumberServiceTest {

    @Mock
    private CheckOrderNumberService it;

    @Mock
//    @InjectMocks
    private OrderIDService orderIDService;

    @Mock
    private PartsService partsService;

    @BeforeEach
    public void setUp() {
        openMocks(this);
        it = new CheckOrderNumberService(orderIDService);
    }

    @DisplayName("Get order with NULL")
    @Test
    void itWorksWithOrderNull() {
        it.getMissingPartsByOrder("123");
    }

    @DisplayName("Get order which not empty")
    @Test
    void itWorksWithOrder() {
        when(orderIDService.getOrderName("123"))
                .thenReturn(new OrderID());

        it.getMissingPartsByOrder("123");
    }

    @DisplayName("Parts is not available in the Order")
    @Test
    void partsIsNotAvailableOrder() {
        when(it.getMissingPartsByOrder("11111367888"))
                .thenReturn(partsService.getAllParts()).thenThrow();
    }

    @DisplayName("Get order with Throws")
    @Test
    void itThrowsOnException() {

       // Exception exception = assertThrows();

//        when(orderIDService.getOrderName("123"))
//                .thenThrow(new RuntimeException());
//
//        it.getMissingPartsByOrder("1423");
    }

    @DisplayName("Get order with Throws")
    @Test
    void it() {
        OrderID orderID = new OrderID();


        it.getMissingPartsByOrder("123");
    }
}

// протестировать Part in Order все в наличие, какие не в наличии,