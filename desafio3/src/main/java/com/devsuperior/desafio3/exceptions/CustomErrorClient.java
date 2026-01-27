package com.devsuperior.desafio3.exceptions;

import java.time.LocalDate;

public class CustomErrorClient {

	private String name;
	private String cpf;
	private Double income;
	private LocalDate birthDate;
	private Integer children;
	
	public CustomErrorClient() {
		super();
	}
	
	public CustomErrorClient(String name, String cpf, Double income, LocalDate birthDate, Integer children) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
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
