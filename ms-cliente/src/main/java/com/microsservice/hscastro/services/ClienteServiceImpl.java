package com.microsservice.hscastro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microsservice.hscastro.domain.Cliente;
import com.microsservice.hscastro.repositories.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	
	@Autowired
	private ClienteRepository repoCliente;
	
	@Override
	public Cliente save(Cliente cliente) {		
		return repoCliente.save(cliente);
	}

	@Override
	public Cliente update(Cliente cliente) {
		Optional<Cliente> clienteDB = repoCliente.findById(cliente.getId());
		if(clienteDB != null) {
			return repoCliente.save(cliente);
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		Optional<Cliente> clienteDB = repoCliente.findById(id);
		if(clienteDB != null) {
			repoCliente.delete(clienteDB.get());
		}		
	}

	@Override
	public Optional<Cliente> findById(Long id) {
		return repoCliente.findById(id);
	}

	@Override
	public List<Cliente> findAll() {		
		return repoCliente.findAll();
	}

}
