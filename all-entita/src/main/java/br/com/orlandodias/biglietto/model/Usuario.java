package br.com.orlandodias.biglietto.model;

import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	private String cdCpfUsu;
	private Empresa empresa;
	private String nmUsu;
	private String idUsu;
	private String cdSnhAtu;
	private String cdSnhAnt;
	private Date dtFimVig;
	private Date dtExpSnh;
	private String cdUsuAtv;
	private String idUsuInc;
	private Date tsInc;
	private String idUsuAlt;
	private Date tsAlt;

	public Usuario() {
		super();
	}

	public String getCdCpfUsu() {
		return cdCpfUsu;
	}

	public void setCdCpfUsu(String cdCpfUsu) {
		this.cdCpfUsu = cdCpfUsu;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getNmUsu() {
		return nmUsu;
	}

	public void setNmUsu(String nmUsu) {
		this.nmUsu = nmUsu;
	}

	public String getIdUsu() {
		return idUsu;
	}

	public void setIdUsu(String idUsu) {
		this.idUsu = idUsu;
	}

	public String getCdSnhAtu() {
		return cdSnhAtu;
	}

	public void setCdSnhAtu(String cdSnhAtu) {
		this.cdSnhAtu = cdSnhAtu;
	}

	public String getCdSnhAnt() {
		return cdSnhAnt;
	}

	public void setCdSnhAnt(String cdSnhAnt) {
		this.cdSnhAnt = cdSnhAnt;
	}

	public Date getDtFimVig() {
		return dtFimVig;
	}

	public void setDtFimVig(Date dtFimVig) {
		this.dtFimVig = dtFimVig;
	}

	public Date getDtExpSnh() {
		return dtExpSnh;
	}

	public void setDtExpSnh(Date dtExpSnh) {
		this.dtExpSnh = dtExpSnh;
	}

	public String getCdUsuAtv() {
		return cdUsuAtv;
	}

	public Boolean getCdUsuAtvAsBoolean() {
		return "At".equalsIgnoreCase(cdUsuAtv);
	}

	public void setCdUsuAtv(String cdUsuAtv) {
		this.cdUsuAtv = cdUsuAtv;
	}

	public void setCdUsuAtvAsBoolean(Boolean cdUsuAtv) {
		if (cdUsuAtv) {
			this.cdUsuAtv = "AT";
		} else {
			this.cdUsuAtv = "SU";
		}
	}

	public String getIdUsuInc() {
		return idUsuInc;
	}

	public void setIdUsuInc(String idUsuInc) {
		this.idUsuInc = idUsuInc;
	}

	public Date getTsInc() {
		return tsInc;
	}

	public void setTsInc(Date tsInc) {
		this.tsInc = tsInc;
	}

	public String getIdUsuAlt() {
		return idUsuAlt;
	}

	public void setIdUsuAlt(String idUsuAlt) {
		this.idUsuAlt = idUsuAlt;
	}

	public Date getTsAlt() {
		return tsAlt;
	}

	public void setTsAlt(Date tsAlt) {
		this.tsAlt = tsAlt;
	}

}
