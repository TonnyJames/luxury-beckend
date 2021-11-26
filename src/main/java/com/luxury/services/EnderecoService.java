package com.luxury.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luxury.domain.Cliente;
import com.luxury.domain.Endereco;
import com.luxury.domain.dtos.EnderecoDTO;
import com.luxury.repositories.EnderecoRepository;
import com.luxury.services.exceptions.ObjectnotFoundException;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repository;

	@Autowired
	private ClienteService clienteService;

	public Endereco findById(Integer id) {
		Optional<Endereco> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado" + id));
	}

	public List<Endereco> findAll() {
		return repository.findAll();
	}

	public Endereco create(@Valid EnderecoDTO objDTO) {
		return repository.save(newEndereco(objDTO));
	}

	public Endereco update(Integer id, @Valid EnderecoDTO objDTO) {
		objDTO.setId(id);
		Endereco oldObj = findById(id);
		oldObj = newEndereco(objDTO);
		return repository.save(oldObj);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}

	private Endereco newEndereco(EnderecoDTO obj) {
		Cliente cliente = clienteService.findById(obj.getCliente());

		Endereco endereco = new Endereco();
		if (obj.getId() != null) {
			endereco.setId(obj.getId());
		}

		endereco.setEndereco(obj.getEndereco());
		endereco.setCep(obj.getCep());
		endereco.setNumResid(obj.getNumResid());
		endereco.setComplemento(obj.getComplemento());
		endereco.setCidade(obj.getCidade());
		endereco.setUf(obj.getUf());
		endereco.setEndereco(obj.getEndereco());
		endereco.setCliente(cliente);
		return endereco;
	}

}
