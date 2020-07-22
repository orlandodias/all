package br.com.orlandodias.biglietto.model;

import java.io.Serializable;

public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;

	private Sistema sistema;
	private Empresa empresa;
	private Integer cdPfl;
	private String dePfl;

	public Perfil() {
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

	public Integer getCdPfl() {
		return cdPfl;
	}

	public void setCdPfl(Integer cdPfl) {
		this.cdPfl = cdPfl;
	}

	public String getDePfl() {
		return dePfl;
	}

	public void setDePfl(String dePfl) {
		this.dePfl = dePfl;
	}

}
