package br.com.orlandodias.biglietto.model;

import java.io.Serializable;

public class SisEmp implements Serializable {
	private static final long serialVersionUID = 1L;

	private Sistema sistema;
	private Empresa empresa;

	public SisEmp() {
		super();
	}

	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
