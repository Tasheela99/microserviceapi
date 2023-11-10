package com.devstack.productserviceapi.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "product_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long code;

    @Column(name = "product_description")
    private String description;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "qty")
    private int qty;
}
