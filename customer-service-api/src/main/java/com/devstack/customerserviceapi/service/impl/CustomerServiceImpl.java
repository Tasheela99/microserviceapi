package com.devstack.customerserviceapi.service.impl;

import com.devstack.customerserviceapi.dto.CustomerDto;
import com.devstack.customerserviceapi.entity.Customer;
import com.devstack.customerserviceapi.repo.CustomerRepo;
import com.devstack.customerserviceapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public void createCustomer(CustomerDto customerDto) {
        Customer customer = new Customer(
                customerDto.getCustomerId(),
                customerDto.getCustomerName(),
                customerDto.getAddress(),
                customerDto.getSalary()
        );
        customerRepo.save(customer);
    }
}
