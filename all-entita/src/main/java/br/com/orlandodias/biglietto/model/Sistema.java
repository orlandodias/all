package br.com.orlandodias.biglietto.model;

import java.io.Serializable;

public class Sistema implements Serializable {
	private static final long serialVersionUID = 1L;

	private String cdSis;
	private String deSis;
	private Integer nuDiaPrzAcs;
	private String cdSisAti;
	private String cdIndVis;

	public Sistema() {
		super();
	}

	public String getCdSis() {
		return cdSis;
	}

	public void setCdSis(String cdSis) {
		this.cdSis = cdSis;
	}

	public String getDeSis() {
		return deSis;
	}

	public void setDeSis(String deSis) {
		this.deSis = deSis;
	}

	public Integer getNuDiaPrzAcs() {
		return nuDiaPrzAcs;
	}

	public void setNuDiaPrzAcs(Integer nuDiaPrzAcs) {
		this.nuDiaPrzAcs = nuDiaPrzAcs;
	}

	public String getCdSisAti() {
		return cdSisAti;
	}

	public Boolean getCdSisAtiAsBoolean() {
		return "A".equalsIgnoreCase(cdSisAti);
	}

	public void setCdSisAti(String cdSisAti) {
		this.cdSisAti = cdSisAti;
	}

	public void setCdSisAtiAsBoolean(Boolean cdSisAti) {
		if (cdSisAti) this.cdSisAti = "A";
		else {
			this.cdSisAti = "S";
		}
	}

	public String getCdIndVis() {
		return cdIndVis;
	}

	public void setCdIndVis(String cdIndVis) {
		this.cdIndVis = cdIndVis;
	}

}
