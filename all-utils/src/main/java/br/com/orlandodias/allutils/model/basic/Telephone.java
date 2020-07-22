package br.com.orlandodias.allutils.model.basic;

import java.io.Serializable;

/*
 * Telephone
 */
public class Telephone implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer cdAre;
	private Integer nuTel;
	private String nuRmlBip;

	public Telephone() {
		super();
	}

	public Integer getCdAre() {
		return cdAre;
	}

	public void setCdAre(Integer cdAre) {
		this.cdAre = cdAre;
	}

	public Integer getNuTel() {
		return nuTel;
	}

	public void setNuTel(Integer nuTel) {
		this.nuTel = nuTel;
	}

	public String getNuRmlBip() {
		return nuRmlBip;
	}

	public void setNuRmlBip(String nuRmlBip) {
		this.nuRmlBip = nuRmlBip;
	}

}
