package com.luxury.domain.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.luxury.domain.Veiculo;
import com.luxury.domain.enums.Uf;

public class VeiculoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	@NotNull(message = "O campo MARCA é obrigatorio")
	private String marca;
	@NotNull(message = "O campo NOME é obrigatorio")
	private String nome;
	
	private String modelo;
	private String ano;
	private String cor;

	@NotNull(message = "O campo PLACA é obrigatorio")
	private String placa;

	@NotNull(message = "O campo CHASSI é obrigatorio")
	private String chassi;

	@NotNull(message = "O campo RENAVAN é obrigatorio")
	private String renavan;

	private String combustivel;
	private String descrição;

	private String vCompra;
	private Uf uf;

//	@JsonFormat(pattern = "dd/MM/yyyy")
	private String dataCompra;
	
	

	public VeiculoDTO() {
		super();
	}
	

	public VeiculoDTO(Veiculo obj) {

		super();
		this.id = obj.getId();
		this.marca = obj.getMarca();
		this.nome = obj.getNome();
		this.modelo = obj.getModelo();
		this.ano = obj.getAno();
		this.cor = obj.getCor();
		this.placa = obj.getPlaca();
		this.chassi = obj.getChassi();
		this.renavan = obj.getRenavan();
		this.combustivel = obj.getCombustivel();
		this.descrição = obj.getDescrição();
		this.vCompra = obj.getvCompra();
		this.uf = obj.getUf();
		this.dataCompra = obj.getDataCompra();
	}




	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getChassi() {
		return chassi;
	}


	public void setChassi(String chassi) {
		this.chassi = chassi;
	}


	public String getRenavan() {
		return renavan;
	}


	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}


	public String getCombustivel() {
		return combustivel;
	}


	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}


	public String getDescrição() {
		return descrição;
	}


	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}


	public String getvCompra() {
		return vCompra;
	}


	public void setvCompra(String vCompra) {
		this.vCompra = vCompra;
	}


	public Uf getUf() {
		return uf;
	}


	public void setUf(Uf uf) {
		this.uf = uf;
	}


	public String getDataCompra() {
		return dataCompra;
	}


	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}

	
	
	
}
