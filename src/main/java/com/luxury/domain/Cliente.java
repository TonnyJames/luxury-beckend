package com.luxury.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.luxury.domain.dtos.ClienteDTO;
import com.luxury.domain.enums.EstadoCivil;
import com.luxury.domain.enums.Sexo;

@Entity
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nomeComp;
	private Sexo sexo;
	private EstadoCivil estCivil;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date nascimento;

	@CPF
	@Column(unique = true)
	private String cpf;

	private String rg;

	@Column(unique = true)
	private String cnh;

	@Column(unique = true)
	private String email;

	@JsonIgnore
	@OneToMany(mappedBy = "cliente")
	private List<Endereco> enderecos = new ArrayList<>();

	private String telefone;

//		@ElementCollection(fetch = FetchType.EAGER)
//		@CollectionTable(name = "SEXO")
//		protected Set<Integer> sexo = new HashSet<>();

//		@ElementCollection(fetch = FetchType.EAGER)
//		@CollectionTable(name = "ESTADOCIVIL")
//		protected Set<Integer> estadocivil = new HashSet<>();	

	public Cliente() {
		super();
	}

//	public Cliente(Integer id, String nomeComp, Sexo sexo, EstadoCivil estCivil, Date nascimento, String cpf, String rg,
//					 String telefone, String cnh, String email) {
//		super();
//		this.id = id;
//		this.nomeComp = nomeComp;
//		this.sexo = sexo;
//		this.estCivil = estCivil;
//		this.nascimento = nascimento;
//		this.cpf = cpf;
//		this.rg = rg;
//		this.cnh = cnh;
//		this.email = email;
//		this.telefone = telefone;
//	}
	
	public Cliente(ClienteDTO obj) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnh == null) ? 0 : cnh.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Cliente other = (Cliente) obj;
		if (cnh == null) {
			if (other.cnh != null)
				return false;
		} else if (!cnh.equals(other.cnh))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
