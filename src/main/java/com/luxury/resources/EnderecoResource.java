package com.luxury.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luxury.domain.Endereco;
import com.luxury.domain.dtos.EnderecoDTO;
import com.luxury.services.EnderecoService;

@RestController
@RequestMapping(value = "/Enderecos")
public class EnderecoResource {
	@Autowired
	private EnderecoService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<EnderecoDTO> findById(@PathVariable Integer id) {
		Endereco obj = service.findById(id);
		return ResponseEntity.ok().body(new EnderecoDTO(obj));
	}

	@GetMapping
	public ResponseEntity<List<EnderecoDTO>> findAll() {
		List<Endereco> list = service.findAll();
		List<EnderecoDTO> listDTO = list.stream().map(obj -> new EnderecoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}

}
