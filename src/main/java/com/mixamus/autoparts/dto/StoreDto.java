package com.mixamus.autoparts.dto;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class StoreDto {

    String numberOrder;

    boolean statusOrder;
}
