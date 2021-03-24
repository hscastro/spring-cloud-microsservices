package com.microsservice.hscastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microsservice.hscastro.domain.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

}
