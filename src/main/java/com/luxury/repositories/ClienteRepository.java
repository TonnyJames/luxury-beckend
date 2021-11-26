package com.luxury.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luxury.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	Optional<Cliente> findByCpf(String cpf);
	Optional<Cliente> findByEmail(String email);
}
