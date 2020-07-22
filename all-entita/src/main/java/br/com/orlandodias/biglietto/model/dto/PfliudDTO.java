package br.com.orlandodias.biglietto.model.dto;

public class PfliudDTO {
	private String v_tpoperacao;
	private Integer v_cdemp;
	private Integer v_cdpfl;
	private String v_depfl;
	private String v_deerro;
	private String v_cdsis;
	private Double v_cderro;

	public String getV_tpoperacao() {
		return this.v_tpoperacao;
	}

	public void setV_tpoperacao(String v_tpoperacao) {
		this.v_tpoperacao = v_tpoperacao;
	}

	public Integer getV_cdemp() {
		return this.v_cdemp;
	}

	public void setV_cdemp(Integer v_cdemp) {
		this.v_cdemp = v_cdemp;
	}

	public String getV_deerro() {
		return this.v_deerro;
	}

	public void setV_deerro(String v_deerro) {
		this.v_deerro = v_deerro;
	}

	public String getV_cdsis() {
		return this.v_cdsis;
	}

	public void setV_cdsis(String v_cdsis) {
		this.v_cdsis = v_cdsis;
	}

	public Integer getV_cdpfl() {
		return v_cdpfl;
	}

	public void setV_cdpfl(Integer v_cdpfl) {
		this.v_cdpfl = v_cdpfl;
	}

	public Double getV_cderro() {
		return this.v_cderro;
	}

	public void setV_cderro(Double v_cderro) {
		this.v_cderro = v_cderro;
	}

	public String getV_depfl() {
		return v_depfl;
	}

	public void setV_depfl(String v_depfl) {
		this.v_depfl = v_depfl;
	}
}