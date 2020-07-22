package br.com.orlandodias.biglietto.model.dto;

import java.io.Serializable;

public class UsuAgtDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer e_cdemp;
	private Integer s_qtAgt;
	private String s_deerro;
	private Double s_cderro;

	public UsuAgtDTO() {
		super();
	}

	public Integer getE_cdemp() {
		return e_cdemp;
	}

	public void setE_cdemp(Integer e_cdemp) {
		this.e_cdemp = e_cdemp;
	}

	public Integer getS_qtAgt() {
		return s_qtAgt;
	}

	public void setS_qtAgt(Integer s_qtAgt) {
		this.s_qtAgt = s_qtAgt;
	}

	public String getS_deerro() {
		return s_deerro;
	}

	public void setS_deerro(String s_deerro) {
		this.s_deerro = s_deerro;
	}

	public Double getS_cderro() {
		return s_cderro;
	}

	public void setS_cderro(Double s_cderro) {
		this.s_cderro = s_cderro;
	}

}