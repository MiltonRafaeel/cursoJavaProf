package com.devsuperior.demo.services;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.demo.dto.ProductDTO;
import com.devsuperior.demo.entities.Product;
import com.devsuperior.demo.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	@Transactional(readOnly = true)
	public Page<ProductDTO> find(PageRequest pageRequest) {
		Page<Product> page = repository.findAll(pageRequest);
		repository.findProductsCategories(page.stream().collect(Collectors.toList()));
		return page.map(x -> new ProductDTO(x));
	}
}