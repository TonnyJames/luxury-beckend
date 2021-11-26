package com.luxury.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.luxury.domain.Endereco;
import com.luxury.domain.dtos.EnderecoDTO;
import com.luxury.services.EnderecoService;

@RestController
@RequestMapping(value = "/enderecos")
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

	@PostMapping
	public ResponseEntity<EnderecoDTO> create(@Valid @RequestBody EnderecoDTO objDTO) {
		Endereco obj = service.create(objDTO);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<EnderecoDTO> update(@PathVariable Integer id, @Valid @RequestBody EnderecoDTO objDTO) {
		Endereco newObj = service.update(id, objDTO);
		return ResponseEntity.ok().body(new EnderecoDTO(newObj));
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<EnderecoDTO> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
