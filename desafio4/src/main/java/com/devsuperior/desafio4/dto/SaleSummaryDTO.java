package com.devsuperior.desafio4.dto;

public class SaleSummaryDTO {
	
	private String sellerName;
	private Double total;
	
	public SaleSummaryDTO() {
		super();
	}

	public SaleSummaryDTO(String sellerName, Double total) {
		super();
		this.sellerName = sellerName;
		this.total = total;
	}

	public String getSellerName() {
		return sellerName;
	}

	public Double getTotal() {
		return total;
	}
}
