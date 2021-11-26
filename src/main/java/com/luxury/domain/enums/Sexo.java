package com.luxury.domain.enums;

public enum Sexo {
	MASCULINO(0, "MASCULINO"), FEMININO(1, "FEMININO"), OUTRO(2, "OUTRO");
	
	private Integer codigo;
	private String descrição;
	
	private Sexo(Integer codigo, String descrição) {
		this.codigo = codigo;
		this.descrição = descrição;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescrição() {
		return descrição;
	}
	
	public static Sexo toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
	
	for (Sexo x : Sexo.values()) {
		if (cod.equals(x.getCodigo())) {
			return x;
		}
	}
	throw new IllegalArgumentException("Sexo inválido");
}
}
