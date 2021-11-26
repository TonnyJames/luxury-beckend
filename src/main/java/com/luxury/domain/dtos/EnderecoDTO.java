package com.luxury.domain.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.luxury.domain.Endereco;
import com.luxury.domain.enums.Uf;

public class EnderecoDTO implements Serializable{
private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String endereco;
	private String cep;
	private String numResid;
	private String complemento;
	private String cidade;
	private Uf uf;
	@NotNull(message = "O Codigo do Cliente deve ser informado")
	private Integer cliente;
	private String nomeCliente;
	
	
	public EnderecoDTO() {
		super();
	}


	public EnderecoDTO(Endereco obj) {
		super();
		this.id = obj.getId();
		this.endereco = obj.getEndereco();
		this.cep = obj.getCep();
		this.numResid = obj.getNumResid();
		this.complemento = obj.getComplemento();
		this.cidade = obj.getCidade();
		this.uf = obj.getUf();
		this.cliente = obj.getCliente().getId();
		this.nomeCliente = obj.getCliente().getNomeComp();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getNumResid() {
		return numResid;
	}


	public void setNumResid(String numResid) {
		this.numResid = numResid;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public Uf getUf() {
		return uf;
	}


	public void setUf(Uf uf) {
		this.uf = uf;
	}


	public Integer getCliente() {
		return cliente;
	}


	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	
}
