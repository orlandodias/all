package br.com.orlandodias.allutils.model;

import java.io.Serializable;

public class BasicTel implements Serializable {
	private static final long serialVersionUID = 1L;

	private SimpleTel simpleTel;
	private Integer nuRml;
	private String deObs;

	public BasicTel() {
		super();
	}

	public SimpleTel getSimpleTel() {
		return simpleTel;
	}

	public void setSimpleTel(SimpleTel simpleTel) {
		this.simpleTel = simpleTel;
	}

	public Integer getNuRml() {
		return nuRml;
	}

	public void setNuRml(Integer nuRml) {
		this.nuRml = nuRml;
	}

	public String getDeObs() {
		return deObs;
	}

	public void setDeObs(String deObs) {
		this.deObs = deObs;
	}

	@Override
	public String toString() {
		return "BasicTel [simpleTel=" + simpleTel + ", nuRml=" + nuRml + ", deObs="
				+ deObs + "]";
	}
}
