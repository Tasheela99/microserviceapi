package com.devstack.productserviceapi.repo;

import com.devstack.productserviceapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ProductRepo extends JpaRepository<Product, Long> {
}
