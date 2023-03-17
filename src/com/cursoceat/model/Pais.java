package com.cursoceat.model;

public enum Pais {

	FRANCIA(20), SPAIN(21), PORTUGAL(23);

	int porcentaje;

	private Pais(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

}
