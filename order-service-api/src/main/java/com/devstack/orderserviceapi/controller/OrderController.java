package com.devstack.orderserviceapi.controller;

import com.devstack.orderserviceapi.dto.OrderDto;
import com.devstack.orderserviceapi.service.OrderService;
import com.devstack.orderserviceapi.util.StandardResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(path = "/create")
    public ResponseEntity<StandardResponseEntity> makeOrder(@RequestBody OrderDto orderDto) {
        orderService.makeOrder(orderDto);
        return new ResponseEntity<>(
                new StandardResponseEntity(
                        201, "Order Saved", orderDto),
                HttpStatus.CREATED
        );
    }
}
