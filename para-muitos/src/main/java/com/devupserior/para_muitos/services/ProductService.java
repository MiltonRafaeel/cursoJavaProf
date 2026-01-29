package com.devupserior.para_muitos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devupserior.para_muitos.dto.CategoryDTO;
import com.devupserior.para_muitos.dto.ProductDTO;
import com.devupserior.para_muitos.entities.Category;
import com.devupserior.para_muitos.entities.Product;
import com.devupserior.para_muitos.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public ProductDTO insert(ProductDTO dto) {
		Product entity = new Product();
		entity.setName(dto.getName());
		entity.setPrice(dto.getPrice());
		for (CategoryDTO catDto : dto.getCategories()) {
			Category cat = new Category();
			cat.setId(catDto.getId());
			entity.getCategories().add(cat);
		}
		entity = repository.save(entity);
		return new ProductDTO(entity);
	}

}
