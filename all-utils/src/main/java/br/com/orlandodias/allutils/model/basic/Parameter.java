package br.com.orlandodias.allutils.model.basic;

@Deprecated
public class Parameter {
	// @id
	// @BMViewField(size=6, maxLength=5)
	private Integer cdPrm;

	// @BMViewField(size=51, maxLength=50)
	// @BMDataPropertyUniqueKey
	// @BMDataListBy
	// @NotNull
	private String dePrm;

	// @BMViewField(size=151, maxLength=80)
	// @NotNull
	private String vlPrm;

	// @BMViewField(size=151, maxLength=80)
	// @NotNull
	private String vlDft;

	// @BMViewField(size=2000, maxLength=2000)
	// @NotNull
	private String vlPsv;

	// @BMViewField(size=2000, maxLength=2000)
	// @NotNull
	private String deInfUsoPrm;

	// @BMViewField(size=11, maxLength=10)
	// @NotNull
	private String chPrm;

	// @BMViewField(size=1, maxLength=1)
	private Boolean flAtv;

	// @Embedded
	private SimpleLog log;

	public Parameter() {
		super();
		this.log = new SimpleLog();
	}

	public Integer getCdPrm() {
		return cdPrm;
	}

	public void setCdPrm(Integer cdPrm) {
		this.cdPrm = cdPrm;
	}

	public String getDePrm() {
		return dePrm;
	}

	public void setDePrm(String dePrm) {
		this.dePrm = dePrm;
	}

	public String getVlPrm() {
		return vlPrm;
	}

	public void setVlPrm(String vlPrm) {
		this.vlPrm = vlPrm;
	}

	public String getVlPsv() {
		return vlPsv;
	}

	public void setVlPsv(String vlPsv) {
		this.vlPsv = vlPsv;
	}

	public String getDeInfUsoPrm() {
		return deInfUsoPrm;
	}

	public void setDeInfUsoPrm(String deInfUsoPrm) {
		this.deInfUsoPrm = deInfUsoPrm;
	}

	public String getChPrm() {
		return chPrm;
	}

	public void setChPrm(String chPrm) {
		this.chPrm = chPrm;
	}

	public Boolean getFlAtv() {
		return flAtv;
	}

	public void setFlAtv(Boolean flAtv) {
		this.flAtv = flAtv;
	}

	public SimpleLog getLog() {
		return log;
	}

	public void setLog(SimpleLog log) {
		this.log = log;
	}

	public String getVlDft() {
		return vlDft;
	}

	public void setVlDft(String vlDft) {
		this.vlDft = vlDft;
	}

	public String[] getArrayVlPsv() {
		String[] myParts = this.vlPsv.split("|");
		return myParts;
	}

}