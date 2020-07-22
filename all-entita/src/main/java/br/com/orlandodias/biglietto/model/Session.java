package br.com.orlandodias.biglietto.model;

import java.io.Serializable;

import org.apache.commons.lang3.text.WordUtils;

public class Session implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer cdAss;
	private Integer cdCli;
	private Integer cdCrt;
	private String cdSgm;
	private Integer cdAgt;
	private Integer cdFil;
	private Integer cdPfl;
	private Integer cdEmp;
	private String nmFtsEmp;
	private String deTit;
	private String deIcn;
	private String nmUsu;
	private String idUsu;
	private String dePfl;
	private String cdSis;
	private String idSssExt;

	public Session() {
		super();
		this.cdAss = 1;
		this.cdCli = 15;
		this.cdCrt = 1;
		this.cdSgm = "PAD";
		this.cdAgt = 1;
		this.cdFil = 1;
		this.cdEmp = 1;
		this.cdSis = "P_A";
	}

	public Integer getCdAss() {
		return cdAss;
	}

	public void setCdAss(Integer cdAss) {
		this.cdAss = cdAss;
	}

	public Integer getCdCli() {
		return cdCli;
	}

	public void setCdCli(Integer cdCli) {
		this.cdCli = cdCli;
	}

	public Integer getCdCrt() {
		return cdCrt;
	}

	public void setCdCrt(Integer cdCrt) {
		this.cdCrt = cdCrt;
	}

	public String getCdSgm() {
		return cdSgm;
	}

	public void setCdSgm(String cdSgm) {
		this.cdSgm = cdSgm;
	}

	public Integer getCdAgt() {
		return cdAgt;
	}

	public void setCdAgt(Integer cdAgt) {
		this.cdAgt = cdAgt;
	}

	public Integer getCdFil() {
		return cdFil;
	}

	public void setCdFil(Integer cdFil) {
		this.cdFil = cdFil;
	}

	public Integer getCdPfl() {
		return cdPfl;
	}

	public void setCdPfl(Integer cdPfl) {
		this.cdPfl = cdPfl;
	}

	public Integer getCdEmp() {
		return cdEmp;
	}

	public void setCdEmp(Integer cdEmp) {
		this.cdEmp = cdEmp;
	}

	public String getNmFtsEmp() {
		return nmFtsEmp;
	}

	public void setNmFtsEmp(String nmFtsEmp) {
		this.nmFtsEmp = nmFtsEmp;
	}

	public String getCdSis() {
		return cdSis;
	}

	public void setCdSis(String cdSis) {
		this.cdSis = cdSis;
	}

	public String getNmUsu() {
		return nmUsu;
	}

	public String getNmUsuCapitalized() {
		return WordUtils.capitalizeFully(nmUsu);
	}

	public void setNmUsu(String nmUsu) {
		this.nmUsu = nmUsu;
	}

	public String getDePfl() {
		return dePfl;
	}

	public String getDePflCapitalized() {
		return WordUtils.capitalizeFully(dePfl);
	}

	public void setDePfl(String dePfl) {
		this.dePfl = dePfl;
	}

	public String getIdSssExt() {
		return idSssExt;
	}

	public void setIdSssExt(String idSssExt) {
		this.idSssExt = idSssExt;
	}

	public String getIdUsu() {
		return idUsu;
	}

	public void setIdUsu(String idUsu) {
		this.idUsu = idUsu;
	}

	public String getDeTit() {
		return deTit;
	}

	public void setDeTit(String deTit) {
		this.deTit = deTit;
	}

	public String getDeIcn() {
		return deIcn;
	}

	public void setDeIcn(String deIcn) {
		this.deIcn = deIcn;
	}

	public Boolean getLoggedIn() {
		return isLoggedIn();
	}

	public Boolean isLoggedIn() {
		return this.nmUsu != null && this.nmUsu.trim().length() != 0;
	}
}
