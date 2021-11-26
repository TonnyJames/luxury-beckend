package com.luxury.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luxury.domain.Endereco;
import com.luxury.repositories.EnderecoRepository;
import com.luxury.services.exceptions.ObjectnotFoundException;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repository;

	public Endereco findById(Integer id) {
		Optional<Endereco> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado" + id));
	}

	public List<Endereco> findAll() {
		return repository.findAll();
	}
}
