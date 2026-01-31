package com.example.jpa_queries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa_queries.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
