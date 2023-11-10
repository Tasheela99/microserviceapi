package com.devstack.orderserviceapi.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "order_table")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private long orderId;

    @Column(name = "customer_id")
    private long customerId;

    @Column(name = "product_id")
    private long productId;

    @Column(name = "cost")
    private double cost;
}
