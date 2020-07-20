package com.drope.productApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.drope.productApi.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
