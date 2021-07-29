package com.clase.SegundaClaseGit;

public class Prueba {

	private String estoNoEsNada;

	public Prueba(String estoNoEsNada) {
		super();
		this.estoNoEsNada = estoNoEsNada;
	}

	public String getEstoNoEsNada() {
		return estoNoEsNada;
	}

	public void setEstoNoEsNada(String estoNoEsNada) {
		this.estoNoEsNada = estoNoEsNada;
	}

	@Override
	public String toString() {
		return "Prueba [estoNoEsNada=" + estoNoEsNada + "]";
	}
}
