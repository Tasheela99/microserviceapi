package com.devstack.customerserviceapi.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "customer_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerId;

    @Column(name = "customer_name",length = 255, nullable = false)
    private String customerName;

    @Column(name = "customer_address",length = 255, nullable = false)
    private String address;

    @Column(name = "customer_salary",length = 45, nullable = false)
    private double salary;

}
