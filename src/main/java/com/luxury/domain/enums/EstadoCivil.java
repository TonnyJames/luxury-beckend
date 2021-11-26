package com.luxury.domain.enums;

public enum EstadoCivil {
	
	CASADO(0, "CASADO"), SOLTEIRO(1, "SOLTEIRO"), DIVORCIADO(2, "DIVORCIADO");
	
	private Integer codigo;
	private String descrição;
	
	private EstadoCivil(Integer codigo, String descrição) {
		this.codigo = codigo;
		this.descrição = descrição;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescrição() {
		return descrição;
	}
	
	public static EstadoCivil toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
	
	for (EstadoCivil x : EstadoCivil.values()) {
		if (cod.equals(x.getCodigo())) {
			return x;
		}
	}
	throw new IllegalArgumentException("Sexo inválido");
}

}
