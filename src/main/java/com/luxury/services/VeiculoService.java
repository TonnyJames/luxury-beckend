package com.luxury.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luxury.domain.Veiculo;
import com.luxury.domain.dtos.VeiculoDTO;
import com.luxury.repositories.VeiculoRepository;
import com.luxury.services.exceptions.ObjectnotFoundException;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository repository;

	public Veiculo findById(Integer id) {
		Optional<Veiculo> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + id));
	}

	public List<Veiculo> All() {
		return repository.findAll();
	}

	public Veiculo create(VeiculoDTO objDTO) {
		objDTO.setId(null);
//		ValidaPorCpfEEmail(objDTO);
		Veiculo newObj = new Veiculo(objDTO);
		return repository.save(newObj);
	}

	public Veiculo update(Integer id, @Valid VeiculoDTO objDTO) {
		objDTO.setId(id);
		Veiculo oldObj = findById(id);
//		ValidaPorCpfEEmail(objDTO);
		oldObj = new Veiculo(objDTO);
		return repository.save(oldObj);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}

//	private void ValidaPorCpfEEmail(VeiculoDTO objDTO) {
//		Optional<Veiculo> obj = repository.findByCpf(objDTO.getCpf());
//		if (obj.isPresent() && obj.get().getId() != objDTO.getId()) {
//			throw new DataIntegrityViolationException("CPF já cadastrado no sistema!");
//		}
//
//		obj = repository.findByEmail(objDTO.getEmail());
//		if (obj.isPresent() && obj.get().getId() != objDTO.getId()) {
//			throw new DataIntegrityViolationException("Email já cadastrado no sistema!");
//		}
//	}

}
