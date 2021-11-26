package com.luxury.domain.enums;

public enum Opcionais {

AR(0, "AR"), TRAVA(1, "TRAVA"), DIRECAO(2, "DIRECAO"), BANCO(1, "BANCO"), TETO(2, "TETO");
	
	private Integer codigo;
	private String descrição;
	
	private Opcionais(Integer codigo, String descrição) {
		this.codigo = codigo;
		this.descrição = descrição;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescrição() {
		return descrição;
	}
	
	public static Opcionais toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
	
	for (Opcionais x : Opcionais.values()) {
		if (cod.equals(x.getCodigo())) {
			return x;
		}
	}
	throw new IllegalArgumentException("");
}
}
