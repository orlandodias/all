package br.com.orlandodias.biglietto.model;

import java.io.Serializable;

public class PflFnc implements Serializable {
	private static final long serialVersionUID = 1L;

	private Sistema sistema;
	private Perfil perfil;
	private Funcao funcao;
	private Empresa empresa;

	public PflFnc() {
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

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

}
