package com.luxury.domain.dtos;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.luxury.domain.Cliente;
import com.luxury.domain.Endereco;
import com.luxury.domain.enums.EstadoCivil;
import com.luxury.domain.enums.Sexo;

public class ClienteDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;	
	@NotNull(message = "O campo NOME é obrigatorio")
	private String nomeComp;
	private Sexo sexo;
	private EstadoCivil estCivil;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date nascimento;
	@NotNull(message = "O campo CPF é obrigatorio")
	private String cpf;
	private String rg;
	@NotNull(message = "O campo CNH é obrigatorio")
	private String cnh;
	@NotNull(message = "O campo EMAIL é obrigatorio")
	private String email;
	private List<Endereco> enderecos = new ArrayList<>();
	private String telefone;
	
	
	public ClienteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ClienteDTO(Cliente obj) {
		super();
		this.id = obj.getId();
		this.nomeComp = obj.getNomeComp();
		this.sexo = obj.getSexo();
		this.estCivil = obj.getEstCivil();
		this.nascimento = obj.getNascimento();
		this.cpf = obj.getCpf();
		this.rg = obj.getRg();
		this.cnh = obj.getCnh();
		this.email = obj.getEmail();
		this.enderecos = obj.getEnderecos();
		this.telefone = obj.getTelefone();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNomeComp() {
		return nomeComp;
	}


	public void setNomeComp(String nomeComp) {
		this.nomeComp = nomeComp;
	}


	public Sexo getSexo() {
		return sexo;
	}


	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}


	public EstadoCivil getEstCivil() {
		return estCivil;
	}


	public void setEstCivil(EstadoCivil estCivil) {
		this.estCivil = estCivil;
	}


	public Date getNascimento() {
		return nascimento;
	}


	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getCnh() {
		return cnh;
	}


	public void setCnh(String cnh) {
		this.cnh = cnh;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Endereco> getEnderecos() {
		return enderecos;
	}


	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	
}
