package com.devstack.orderserviceapi.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDto {
    private long orderId;
    private long customerId;
    private long productId;
    private double cost;
}
