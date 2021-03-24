package com.microsservice.hscastro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microsservice.hscastro.domain.Conta;
import com.microsservice.hscastro.repositories.ContaRepository;

@Service
public class ContaServiceImpl implements ContaService {

	@Autowired
	private ContaRepository repoConta;
	
	@Override
	public Conta save(Conta conta) {
		return repoConta.save(conta);
	}

	@Override
	public Conta update(Conta conta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Conta> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Conta> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
