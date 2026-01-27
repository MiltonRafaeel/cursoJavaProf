package com.devsuperior.desafio3.dto;

import java.time.LocalDate;

import com.devsuperior.desafio3.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

public class ClientDTO {
	
	private Long id;
	
	@NotBlank(message = "necessario preencher este campo")
	private String name;
	private String cpf;
	private Double income;
	
	@PastOrPresent
	private LocalDate birthDate;
	private Integer children;
	
	public ClientDTO() {
		super();
	}
	
	public ClientDTO (Client entity) {
		super();
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}
}
