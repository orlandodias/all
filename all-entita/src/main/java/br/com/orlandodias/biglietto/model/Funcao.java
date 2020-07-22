package br.com.orlandodias.biglietto.model;

import java.io.Serializable;

public class Funcao implements Serializable {
	private static final long serialVersionUID = 1L;
	private Menu menu;
	private Integer cdFnc;
	private String deFnc;
	private String deTxtLnk;
	private String deUrlLnk;
	private String flFncPub;
	private String cdTipFnc;
	private String cdSitFnc;

	public Funcao() {
		super();
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Integer getCdFnc() {
		return cdFnc;
	}

	public void setCdFnc(Integer cdFnc) {
		this.cdFnc = cdFnc;
	}

	public String getDeFnc() {
		return deFnc;
	}

	public void setDeFnc(String deFnc) {
		this.deFnc = deFnc;
	}

	public String getDeTxtLnk() {
		return deTxtLnk;
	}

	public void setDeTxtLnk(String deTxtLnk) {
		this.deTxtLnk = deTxtLnk;
	}

	public String getDeUrlLnk() {
		return deUrlLnk;
	}

	public void setDeUrlLnk(String deUrlLnk) {
		this.deUrlLnk = deUrlLnk;
	}

	public String getFlFncPub() {
		return flFncPub;
	}

	public Boolean getflFncPubAsBoolean() {
		return "S".equalsIgnoreCase(flFncPub);
	}

	
	public void setFlFncPub(String flFncPub) {
		this.flFncPub = flFncPub;
	}

	public void setFlFncPubAsBoolean(Boolean flFncPub) {
		if (flFncPub) {
			this.flFncPub = "S";
		} else {
			this.flFncPub = "N";
		}
	}
	public String getCdTipFnc() {
		return cdTipFnc;
	}

	public void setCdTipFnc(String cdTipFnc) {
		this.cdTipFnc = cdTipFnc;
	}

	public String getCdSitFnc() {
		return cdSitFnc;
	}

	public Boolean getCdSitFncAsBoolean() {
		return "A".equalsIgnoreCase(cdSitFnc);
	}

	public void setCdSitFnc(String cdSitFnc) {
		this.cdSitFnc = cdSitFnc;
	}

	public void setCdSitFncAsBoolean(Boolean cdSitFnc) {
		if (cdSitFnc) {
			this.cdSitFnc = "A";
		} else {
			this.cdSitFnc = "S";
		}
	}

}
