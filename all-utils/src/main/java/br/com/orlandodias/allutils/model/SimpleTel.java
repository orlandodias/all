package br.com.orlandodias.allutils.model;

import java.io.Serializable;

public class SimpleTel implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer cdAre;
	private Integer nuTel;

	public SimpleTel() {
		super();
	}

	public SimpleTel(Integer cdAre, Integer nuTel) {
		super();
		this.cdAre = cdAre;
		this.nuTel = nuTel;
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

	@Override
	public String toString() {
		return "SimpleTel [cdAre=" + cdAre + ", nuTel=" + nuTel + "]";
	}

}
