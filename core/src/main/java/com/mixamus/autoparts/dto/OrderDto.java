package com.mixamus.autoparts.dto;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class OrderDto {

    String numberOrder;

    boolean statusOrder;
}
