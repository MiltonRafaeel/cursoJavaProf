package com.devupserior.para_muitos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devupserior.para_muitos.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}