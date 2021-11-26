package com.luxury.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.luxury.domain.dtos.VeiculoDTO;
import com.luxury.domain.enums.Uf;

@Entity
public class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String marca;
	private String nome;
	private String modelo;
	private String ano;
	private String cor;

	@Column(unique = true)
	private String placa;

	@Column(unique = true)
	private String chassi;

	@Column(unique = true)
	private String renavan;

	private String combustivel;
	private String descrição;

	private String vCompra;
	private Uf uf;

//	@JsonFormat(pattern = "dd/MM/yyyy")
	private String dataCompra;

	public Veiculo() {
		super();
	}

//	public Veiculo(Integer id, String marca, String nome, String modelo, String ano, String cor, String placa,
//			String chassi, String renavan, String combustivel, String descrição, Integer vCompra, Uf uf) {
//		super();
//		this.id = id;
//		this.marca = marca;
//		this.nome = nome;
//		this.modelo = modelo;
//		this.ano = ano;
//		this.cor = cor;
//		this.placa = placa;
//		this.chassi = chassi;
//		this.renavan = renavan;
//		this.combustivel = combustivel;
//		this.descrição = descrição;
//		this.vCompra = vCompra;
//		this.uf = uf;
//	}
	
	public Veiculo(VeiculoDTO obj) {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chassi == null) ? 0 : chassi.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		result = prime * result + ((renavan == null) ? 0 : renavan.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (chassi == null) {
			if (other.chassi != null)
				return false;
		} else if (!chassi.equals(other.chassi))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		if (renavan == null) {
			if (other.renavan != null)
				return false;
		} else if (!renavan.equals(other.renavan))
			return false;
		return true;
	}
	
	

}
