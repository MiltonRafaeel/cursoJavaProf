package com.devsuperior.desafio3.exceptions;

public class CustomMessageErrorPost {

	private String fieldName;
	private String message;
	
	public CustomMessageErrorPost(String fieldName, String message) {
		super();
		this.fieldName = fieldName;
		this.message = message;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	public String getMessage() {
		return message;
	}
}
