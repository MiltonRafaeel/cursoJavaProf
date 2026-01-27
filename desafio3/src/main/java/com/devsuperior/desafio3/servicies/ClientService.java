package com.devsuperior.desafio3.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.devsuperior.desafio3.dto.ClientDTO;
import com.devsuperior.desafio3.entities.Client;
import com.devsuperior.desafio3.exceptions.ResourceNotFoundException;
import com.devsuperior.desafio3.repositories.ClientRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAll(Pageable pageable) {
		Page<Client> result = clientRepository.findAll(pageable);
		return result.map(x -> new ClientDTO(x));
	}
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Client client = clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("id nao existe"));
		return new ClientDTO(client);
	}
	
	@Transactional
	public ClientDTO insert(ClientDTO dto) {
		Client client = new Client();
		client.setName(dto.getName());
		client.setCpf(dto.getCpf());
		client.setIncome(dto.getIncome());
		client.setBirthDate(dto.getBirthDate());
		client.setChildren(dto.getChildren());
		
		client = clientRepository.save(client);
		return new ClientDTO(client);	
	}
	
	@Transactional
	public ClientDTO update (Long id, ClientDTO dto) {
		try {
		Client client = clientRepository.getReferenceById(id);
		copyDtoToEntity(dto, client);
		client = clientRepository.save(client);
		return new ClientDTO(client);
		}
		catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("id nao existe");
		}
	}
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public ResponseEntity<Void> delete(@PathVariable Long id) {
	    if (!clientRepository.existsById(id)) {
	        throw new ResourceNotFoundException("Recurso não encontrado");
	    }
	    clientRepository.deleteById(id);
	    return ResponseEntity.ok().build();
	}
	
	private void copyDtoToEntity (ClientDTO dto, Client client) {
		client.setName(dto.getName());
		client.setCpf(dto.getCpf());
		client.setIncome(dto.getIncome());
		client.setBirthDate(dto.getBirthDate());
		client.setChildren(dto.getChildren());
	} 
}
