package br.com.orlandodias.biglietto.model.dto;

import java.io.Serializable;

import br.com.orlandodias.biglietto.model.Empresa;

public class UsuariosCadastradosDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Empresa empresa;
	private Integer qtUsuAtv;
	private Integer qtUsuCad;

	public UsuariosCadastradosDTO() {
		super();
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Integer getQtUsuAtv() {
		return qtUsuAtv;
	}

	public void setQtUsuAtv(Integer qtUsuAtv) {
		this.qtUsuAtv = qtUsuAtv;
	}

	public Integer getQtUsuCad() {
		return qtUsuCad;
	}

	public void setQtUsuCad(Integer qtUsuCad) {
		this.qtUsuCad = qtUsuCad;
	}

}
