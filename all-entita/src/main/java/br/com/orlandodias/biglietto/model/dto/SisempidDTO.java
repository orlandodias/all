package br.com.orlandodias.biglietto.model.dto;

public class SisempidDTO {
	private String v_tpoperacao;
	private String v_deerro;
	private String v_cdsis;
	private Integer v_cdemp;
	private Double v_cderro;

	public String getV_tpoperacao() {
		return this.v_tpoperacao;
	}

	public void setV_tpoperacao(String v_tpoperacao) {
		this.v_tpoperacao = v_tpoperacao;
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

	public Integer getV_cdemp() {
		return v_cdemp;
	}

	public void setV_cdemp(Integer v_cdemp) {
		this.v_cdemp = v_cdemp;
	}

	public Double getV_cderro() {
		return this.v_cderro;
	}

	public void setV_cderro(Double v_cderro) {
		this.v_cderro = v_cderro;
	}
}