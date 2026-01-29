package com.devupserior.para_muitos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devupserior.para_muitos.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
