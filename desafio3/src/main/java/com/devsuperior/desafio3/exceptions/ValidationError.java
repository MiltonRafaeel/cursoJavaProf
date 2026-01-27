	package com.devsuperior.desafio3.exceptions;
	
	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.List;
	
	public class ValidationError extends CustomErrorClient {
		
		private List<CustomMessageErrorPost> errors = new ArrayList<>();
	
		public ValidationError(String name, String cpf, Double income, LocalDate birthDate, Integer children) {
			super(name, cpf, income, birthDate, children);
		}
	
		public List<CustomMessageErrorPost> getErrors() {
			return errors;
		}
		
		public void addError(String fieldName, String message) {
			errors.add(new CustomMessageErrorPost(fieldName, message));
		}
	}
