package br.com.orlandodias.allutils.model.parms;

import java.io.Serializable;

/**
 * Define a specific behavior for a system element.
 * 
 * @author OrlandoDias
 * @version 1.00
 */
@Deprecated
public class Parm implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Unique ID for parameter
	 */
	private Integer idPrm;

	/**
	 * Name of parameter
	 */
	private String nmPrm;

	/**
	 * Unique Code for parameter
	 */
	private String cdPrm;

	/**
	 * Type of parameter
	 */
	private String tpPrm;

	/**
	 * Default value for parameter
	 */
	private String vlPrmDft;

	/**
	 * Possible values for parameter
	 */
	private String vlPrmPsv[];

	public Parm() {
		super();
	}

	public Integer getIdPrm() {
		return idPrm;
	}

	public void setIdPrm(Integer idPrm) {
		this.idPrm = idPrm;
	}

	public String getNmPrm() {
		return nmPrm;
	}

	public void setNmPrm(String nmPrm) {
		this.nmPrm = nmPrm;
	}

	public String getCdPrm() {
		return cdPrm;
	}

	public void setCdPrm(String cdPrm) {
		this.cdPrm = cdPrm;
	}

	public String getTpPrm() {
		return tpPrm;
	}

	public void setTpPrm(String tpPrm) {
		this.tpPrm = tpPrm;
	}

	public String getVlPrmDft() {
		return vlPrmDft;
	}

	public void setVlPrmDft(String vlPrmDft) {
		this.vlPrmDft = vlPrmDft;
	}

	public String[] getVlPrmPsv() {
		return vlPrmPsv;
	}

	public void setVlPrmPsv(String[] vlPrmPsv) {
		this.vlPrmPsv = vlPrmPsv;
	}

}
