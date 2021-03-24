package com.microsservice.hscastro.services;

import java.util.List;
import java.util.Optional;

import com.microsservice.hscastro.domain.Conta;

public interface ContaService {

	Conta save(Conta conta);
	Conta update(Conta conta);
	Optional<Conta> findById(Long id);
	void delete(Long id);
	List<Conta> findAll();
}
