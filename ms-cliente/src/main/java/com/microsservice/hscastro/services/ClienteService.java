package com.microsservice.hscastro.services;

import java.util.List;
import java.util.Optional;

import com.microsservice.hscastro.domain.Cliente;

public interface ClienteService {

	Cliente save(Cliente cliente);
	Cliente update(Cliente cliente);
	void delete(Long id);
	Optional<Cliente> findById(Long id);
	List<Cliente> findAll();
	
}
