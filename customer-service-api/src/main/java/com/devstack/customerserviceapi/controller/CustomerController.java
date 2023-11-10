package com.devstack.customerserviceapi.controller;

import com.devstack.customerserviceapi.dto.CustomerDto;
import com.devstack.customerserviceapi.service.CustomerService;
import com.devstack.customerserviceapi.util.StandardResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/create")
    public ResponseEntity<StandardResponseEntity> createCustomer(@RequestBody CustomerDto customerDto) {
        customerService.createCustomer(customerDto);
        return new ResponseEntity<>(
                new StandardResponseEntity(
                        200, "Customer Saved", customerDto),
                HttpStatus.CREATED
        );
    }

}
