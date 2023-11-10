package com.devstack.productserviceapi.service;

import com.devstack.productserviceapi.dto.ProductDto;

public interface ProductService {
    void createProduct(ProductDto productDto);
}
