package br.com.orlandodias.biglietto.model.dto;

public class IncpflDTO {
	private Double s_cdpfl;
	private String e_cdsis;
	private String e_depfl;
	private Double e_cdemp;

	public Double getS_cdpfl() {
		return this.s_cdpfl;
	}

	public void setS_cdpfl(Double s_cdpfl) {
		this.s_cdpfl = s_cdpfl;
	}

	public String getE_cdsis() {
		return this.e_cdsis;
	}

	public void setE_cdsis(String e_cdsis) {
		this.e_cdsis = e_cdsis;
	}

	public String getE_depfl() {
		return this.e_depfl;
	}

	public void setE_depfl(String e_depfl) {
		this.e_depfl = e_depfl;
	}

	public Double getE_cdemp() {
		return this.e_cdemp;
	}

	public void setE_cdemp(Double e_cdemp) {
		this.e_cdemp = e_cdemp;
	}
}