package com.practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Long>{
     Product findByProductCode(String productCode);

}
