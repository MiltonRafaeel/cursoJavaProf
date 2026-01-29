package com.devupserior.para_muitos.dto;

import com.devupserior.para_muitos.entities.Category;

public class CategoryDTO {

	private Long id;
	private String name;

	public CategoryDTO() {
		super();
	}

	public CategoryDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public CategoryDTO(Category entity) {
		super();
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
