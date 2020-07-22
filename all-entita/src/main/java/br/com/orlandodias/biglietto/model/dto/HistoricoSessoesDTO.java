package br.com.orlandodias.biglietto.model.dto;

import java.io.Serializable;
import java.util.Date;

import br.com.orlandodias.biglietto.model.Empresa;
import br.com.orlandodias.biglietto.model.Sistema;

public class HistoricoSessoesDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Empresa empresa;
	private Sistema sistema;
	private Date[] datas = new Date[10];
	private Integer[] usuarios = new Integer[10];
	private Integer[] sessoes = new Integer[10];

	public HistoricoSessoesDTO() {
		super();
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public Date[] getDatas() {
		return datas;
	}

	public void setDatas(Date[] datas) {
		this.datas = datas;
	}

	public Integer[] getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Integer[] usuarios) {
		this.usuarios = usuarios;
	}

	public Integer[] getSessoes() {
		return sessoes;
	}

	public void setSessoes(Integer[] sessoes) {
		this.sessoes = sessoes;
	}

}
