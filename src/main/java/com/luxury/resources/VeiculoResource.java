package com.luxury.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.luxury.domain.Veiculo;
import com.luxury.domain.dtos.VeiculoDTO;
import com.luxury.services.VeiculoService;

@CrossOrigin
@RestController
@RequestMapping(value = "/veiculos") //localhost:8080/veiculos
public class VeiculoResource {

	@Autowired
	private VeiculoService service;

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/{id}")
	public ResponseEntity<VeiculoDTO> findById(@PathVariable Integer id) {
		Veiculo obj = service.findById(id);
		return ResponseEntity.ok().body(new VeiculoDTO(obj));
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public ResponseEntity<List<VeiculoDTO>>findAll(){
		List<Veiculo> list = service.All();
		List<VeiculoDTO> listDTO = list.stream().map(obj -> new VeiculoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping
	public ResponseEntity<VeiculoDTO> create(@RequestBody VeiculoDTO objDTO){
		Veiculo newObj = service.create(objDTO);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping(value = "/{id}")
	public ResponseEntity<VeiculoDTO> update(@PathVariable Integer id, @Valid @RequestBody VeiculoDTO objDTO) {
		Veiculo obj = service.update(id, objDTO);
		return ResponseEntity.ok().body(new VeiculoDTO(obj));
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<VeiculoDTO>delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
		
	}
}
