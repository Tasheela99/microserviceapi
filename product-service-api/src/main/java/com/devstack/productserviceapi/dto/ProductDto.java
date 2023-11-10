package com.devstack.productserviceapi.dto;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ProductDto {

    private long code;


    private String description;


    private double unitPrice;


    private int qty;
}
