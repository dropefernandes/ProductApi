package com.drope.productApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drope.productApi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
