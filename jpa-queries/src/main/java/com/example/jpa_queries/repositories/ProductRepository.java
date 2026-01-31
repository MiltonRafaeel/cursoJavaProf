package com.example.jpa_queries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.jpa_queries.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query(value = "SELECT obj FROM Product obj JOIN FETCH obj.categories")
	List<Product> searchAll();
}
