package com.devsuperior.desafio3.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devsuperior.desafio3.dto.ClientDTO;
import com.devsuperior.desafio3.servicies.ClientService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping
	public Page<ClientDTO> findAll(Pageable pageable) {
		return clientService.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public ClientDTO findBydId (@PathVariable Long id) {
		ClientDTO dto = clientService.findById(id);
		return dto;
	}
	
	@PostMapping
	public ResponseEntity<ClientDTO> insert (@Valid @RequestBody ClientDTO dto) {
		dto = clientService.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<ClientDTO> update (@PathVariable Long id, @Valid @RequestBody ClientDTO dto) {
		dto = clientService.update(id, dto);
		return ResponseEntity.ok(dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete (@PathVariable Long id) {
		clientService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
