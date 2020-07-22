package br.com.orlandodias.biglietto.model;

import java.io.Serializable;

public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer cdEmp;
	private String nmEmp;
	private String nmFtsEmp;
	private String cdTipPes;
	private Long cdCpfCpj;

	public Empresa() {
		super();
	}

	public Integer getCdEmp() {
		return cdEmp;
	}

	public void setCdEmp(Integer cdEmp) {
		this.cdEmp = cdEmp;
	}

	public String getNmEmp() {
		return nmEmp;
	}

	public void setNmEmp(String nmEmp) {
		this.nmEmp = nmEmp;
	}

	public String getNmFtsEmp() {
		return nmFtsEmp;
	}

	public void setNmFtsEmp(String nmFtsEmp) {
		this.nmFtsEmp = nmFtsEmp;
	}

	public String getCdTipPes() {
		return cdTipPes;
	}

	public void setCdTipPes(String cdTipPes) {
		this.cdTipPes = cdTipPes;
	}

	public Long getCdCpfCpj() {
		return cdCpfCpj;
	}

	public void setCdCpfCpj(Long cdCpfCpj) {
		this.cdCpfCpj = cdCpfCpj;
	}

}
