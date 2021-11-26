package com.luxury.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luxury.domain.Cliente;
import com.luxury.domain.Endereco;
import com.luxury.domain.Veiculo;
import com.luxury.domain.enums.EstadoCivil;
import com.luxury.domain.enums.Sexo;
import com.luxury.domain.enums.Uf;
import com.luxury.repositories.ClienteRepository;
import com.luxury.repositories.EnderecoRepository;
import com.luxury.repositories.VeiculoRepository;

@Service
public class DBService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private VeiculoRepository veiculoRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	public void instanciaDB() {

//		Clientes
//		Cliente cl1 = new Cliente(null, "Yan Witter", Sexo.MASCULINO, EstadoCivil.SOLTEIRO, null, "56388735380",
//				"35.163.418-6", "35.163.418-6", "24262605674", "yvan.rios@geradornv.com.br");
//
////		Endereços
//		Endereco end1 = new Endereco(null, "Rua Manoel dos Santos", "03318-040", "25", "Vila Gomes Cardim", "São Paulo",
//				Uf.SP, cl1);
//
////		Veiculos
//		Veiculo vl1 = new Veiculo(null, "Nissan", "Frontier", "AX 3.2 CD Diesel", "2020", "Preto", "KWF-0061",
//				"8c6 9jSCKX DW 8U0390", "39718162361", "Flex", "Novo", 63000, Uf.MG);
//
//		clienteRepository.saveAll(Arrays.asList(cl1));
//		enderecoRepository.saveAll(Arrays.asList(end1));
//		veiculoRepository.saveAll(Arrays.asList(vl1));
	}
}
