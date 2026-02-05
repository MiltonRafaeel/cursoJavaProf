package com.devsuperior.desafio4.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio4.dto.SaleMinDTO;
import com.devsuperior.desafio4.dto.SaleSummaryDTO;
import com.devsuperior.desafio4.entities.Sale;
import com.devsuperior.desafio4.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	public SaleMinDTO findById(Long id) {
		Optional<Sale> result = repository.findById(id);
		Sale entity = result.get();
		return new SaleMinDTO(entity);
	}
	
	public Page<SaleMinDTO> getReport(String minDate, String maxDate, String name, Pageable pageable) {
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		LocalDate min;
		LocalDate max;
		if (maxDate == null || maxDate.equals("")) {
			max = today;
		}
		else {
			max = LocalDate.parse(maxDate);
		}
		if (minDate == null || minDate.equals("")) {
			min = max.minusYears(1L);
		} 
		else {
			min = LocalDate.parse(minDate);
		}
		return repository.searchReport(min, max, name, pageable);
	}
	
	public List<SaleSummaryDTO> getSummary(String minDate, String maxDate) {
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		LocalDate max = (maxDate == null || maxDate.equals("")) ? today : LocalDate.parse(maxDate);
		LocalDate min = (minDate == null || minDate.equals("")) ? max.minusYears(1L) : LocalDate.parse(minDate);

		return repository.searchSummary(min, max);
	}
}
