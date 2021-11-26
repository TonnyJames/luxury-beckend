package com.luxury.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luxury.domain.Cliente;
import com.luxury.domain.dtos.ClienteDTO;
import com.luxury.repositories.ClienteRepository;
import com.luxury.services.exceptions.DataIntegrityViolationException;
import com.luxury.services.exceptions.ObjectnotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public Cliente findById(Integer id) {
		Optional<Cliente> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + id));
	}

	public List<Cliente> All() {
		return repository.findAll();
	}

	public Cliente create(ClienteDTO objDTO) {
		objDTO.setId(null);
		ValidaPorCpfEEmail(objDTO);
		Cliente newObj = new Cliente(objDTO);
		return repository.save(newObj);
	}

	public Cliente update(Integer id, @Valid ClienteDTO objDTO) {
		objDTO.setId(id);
		Cliente oldObj = findById(id);
		ValidaPorCpfEEmail(objDTO);
		oldObj = new Cliente(objDTO);
		return repository.save(oldObj);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}

	private void ValidaPorCpfEEmail(ClienteDTO objDTO) {
		Optional<Cliente> obj = repository.findByCpf(objDTO.getCpf());
		if (obj.isPresent() && obj.get().getId() != objDTO.getId()) {
			throw new DataIntegrityViolationException("CPF já cadastrado no sistema!");
		}

		obj = repository.findByEmail(objDTO.getEmail());
		if (obj.isPresent() && obj.get().getId() != objDTO.getId()) {
			throw new DataIntegrityViolationException("Email já cadastrado no sistema!");
		}
	}
}
