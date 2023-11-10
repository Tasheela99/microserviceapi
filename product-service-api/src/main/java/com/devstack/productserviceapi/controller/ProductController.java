package com.devstack.productserviceapi.controller;

import com.devstack.productserviceapi.dto.ProductDto;
import com.devstack.productserviceapi.service.ProductService;
import com.devstack.productserviceapi.util.StandardResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping(path = "/create")
    public ResponseEntity<StandardResponseEntity> createProduct(@RequestBody ProductDto productDto){
        productService.createProduct(productDto);
        return new ResponseEntity<StandardResponseEntity>(
                new StandardResponseEntity(
                        201,"Saved Successfully",productDto),
                HttpStatus.CREATED
        );

    }
}
