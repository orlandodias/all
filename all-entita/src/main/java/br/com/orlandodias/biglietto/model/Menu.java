package br.com.orlandodias.biglietto.model;

import java.io.Serializable;

public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer cdMnu;
	private String deMnu;
	private Sistema sistema;

	public Menu() {
		super();
	}

	public Integer getCdMnu() {
		return cdMnu;
	}

	public void setCdMnu(Integer cdMnu) {
		this.cdMnu = cdMnu;
	}

	public String getDeMnu() {
		return deMnu;
	}

	public void setDeMnu(String deMnu) {
		this.deMnu = deMnu;
	}

	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

}
