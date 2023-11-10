package com.devstack.orderserviceapi.service.impl;

import com.devstack.orderserviceapi.dto.OrderDto;
import com.devstack.orderserviceapi.entity.Order;
import com.devstack.orderserviceapi.repo.OrderRepo;
import com.devstack.orderserviceapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;
    @Override
    public void makeOrder(OrderDto orderDto) {
        Order order = new Order(
                orderDto.getOrderId(),
                orderDto.getCustomerId(),
                orderDto.getProductId(),
                orderDto.getCost()
        );
        orderRepo.save(order);
    }
}
