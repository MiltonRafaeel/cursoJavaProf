package com.devsuperior.dscommerce.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.entities.Product;
import com.devsuperior.dscommerce.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public ProductDTO findById (Long id) {
	//	Optional<Product> result = repository.findById(id);
		Product product = repository.findById(id).get();
	//	ProductDTO dto = new ProductDTO(product.getId(), product.getName(), product.getDescription(), product.getPrice(), product.getImgUrl());
		return new ProductDTO(product);
	//	return dto;
	} 
}
