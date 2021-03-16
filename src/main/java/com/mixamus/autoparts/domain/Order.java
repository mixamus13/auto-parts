package com.mixamus.autoparts.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String numberOrder;

    //List<OrderItem> orderItems;

    boolean statusOrder; // сделать Enum
}
