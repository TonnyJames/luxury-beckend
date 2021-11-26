package com.luxury.domain.enums;

public enum Uf {
SP(0, "SÃO PAULO"), MG(1, "MINAS GERAIS"), AC(2, "ACRE");
	
	private Integer codigo;
	private String descrição;
	
	private Uf(Integer codigo, String descrição) {
		this.codigo = codigo;
		this.descrição = descrição;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescrição() {
		return descrição;
	}
	
	public static Uf toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
	
	for (Uf x : Uf.values()) {
		if (cod.equals(x.getCodigo())) {
			return x;
		}
	}
	throw new IllegalArgumentException("UF inválido");
}
}
