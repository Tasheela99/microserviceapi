package com.devstack.productserviceapi.service.impl;

import com.devstack.productserviceapi.dto.ProductDto;
import com.devstack.productserviceapi.entity.Product;
import com.devstack.productserviceapi.repo.ProductRepo;
import com.devstack.productserviceapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;
    @Override
    public void createProduct(ProductDto productDto) {
        Product product = new Product(
                productDto.getCode(),
                productDto.getDescription(),
                productDto.getUnitPrice(),
                productDto.getQty()
        );
        productRepo.save(product);
    }
}
