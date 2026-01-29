package com.devupserior.para_muitos.dto;

import java.util.ArrayList;
import java.util.List;

import com.devupserior.para_muitos.entities.Category;
import com.devupserior.para_muitos.entities.Product;

public class ProductDTO {

	private Long id;
	private String name;
	private Double price;

	private List<CategoryDTO> categories = new ArrayList<>();

	public ProductDTO() {
		super();
	}

	public ProductDTO(Long id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public ProductDTO(Product entity) {
		super();
		id = entity.getId();
		name = entity.getName();
		price = entity.getPrice();
		for (Category cat : entity.getCategories()) {
			categories.add(new CategoryDTO(cat));
		}
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public List<CategoryDTO> getCategories() {
		return categories;
	}
}
