package com.mixamus.autoparts.service;

import com.mixamus.autoparts.domain.OrderID;
import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.domain.StatusOrderID;
import com.mixamus.autoparts.exceptions.OrderIDNotFoundException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@DisplayName("Check ordernumber service")
@ExtendWith(MockitoExtension.class)
public class CheckOrderNumberServiceTest {

    @InjectMocks
    private CheckOrderNumberService it;

    @Mock
    private OrderIDService orderIDService;

    @Mock
    private PartsService partsService;

    @DisplayName("Namberorder is NULL")
    @Test
    void itNumberorderWithOrderNull() {
        assertThat(it.getMissingPartsByOrder("")).isNull();

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
        OrderID orderID = new OrderID();
        Part part = new Part();
        part.setAvailability(StatusOrderID.NON_STOCK);
        orderID.setPart(List.of(part));
        when(orderIDService.getOrderName("11111367888"))
                .thenReturn(orderID);

        List<Part> actual = it.getMissingPartsByOrder("11111367888");

        assertThat(actual.size()).isEqualTo(1);
    }

    @DisplayName("Get order with Throws")
    @Test
    void itThrowsOnException() {

        when(orderIDService.getOrderName("131313"))
                .thenThrow(new OrderIDNotFoundException("13"));

        assertThrows(OrderIDNotFoundException.class, () -> it.getMissingPartsByOrder("131313"));

    }

    @DisplayName("Get pass by order")
    @Test
    void shouldGetPassByOrderId() {
        OrderID orderID = new OrderID();
        when(orderIDService.getOrderName("666666666"))
                .thenReturn(orderID);
        List<Part> actual = it.getMissingPartsByOrder("666666666");

        assertNotNull(actual);
        verify(orderIDService, times(1)).getOrderName("666666666");
    }
}