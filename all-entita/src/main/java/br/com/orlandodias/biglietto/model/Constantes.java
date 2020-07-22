package br.com.orlandodias.biglietto.model;

public class Constantes {
	private Integer cdAss;
	private Integer cdCli;
	private Integer cdCrt;
	private String cdSgm;
	private Integer cdAgt;
	private Integer cdFil;

	public Constantes() {
		super();
		this.cdAss = 1;
		this.cdCli = 2;
		this.cdCrt = 1;
		this.cdSgm = "PAD";
		this.cdAgt = 1;
		this.cdFil = 1;
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

}
