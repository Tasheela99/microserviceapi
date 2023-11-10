package com.devstack.customerserviceapi.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDto {

    private long customerId;
    private String customerName;
    private String address;
    private double salary;

}
