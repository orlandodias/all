package br.com.orlandodias.allutils.model;

import java.util.ArrayList;

public class Parm {
	// @Column(name=CDPRM)
	// @NotNull
	// @BMViewField(size=5, maxLength=5)
	// @Id
	private Integer cdPrm;

	// @Column(name=CHPRM)
	// @BMViewField(size=10, maxLength=10)
	private String chPrm;

	// @Column(name=DEINFUSOPRM)
	// @BMViewField(size=2000, maxLength=2000)
	private String deInfUsoPrm;

	// @Column(name=DEPRM)
	// @BMDataListBy
	// @BMViewField(size=50, maxLength=50)
	private String dePrm;

	// @Column(name=VLPRM)
	// @BMViewField(size=150, maxLength=150)
	private String vlPrm;

	// @Column(name=VLPSV)
	// @BMViewField(size=2000, maxLength=2000)
	private String vlPsv;

	// @Column(name=VLDFT)
	// @BMViewField(size=2000, maxLength=2000)
	private String vlDft;

	public Parm() {
		super();
	}

	public Integer getCdPrm() {
		return this.cdPrm;
	}

	public void setCdPrm(Integer cdPrm) {
		this.cdPrm = cdPrm;
	}

	public String getChPrm() {
		return this.chPrm;
	}

	public void setChPrm(String chPrm) {
		this.chPrm = chPrm;
	}

	public String getDeInfUsoPrm() {
		return this.deInfUsoPrm;
	}

	public void setDeInfUsoPrm(String deInfUsoPrm) {
		this.deInfUsoPrm = deInfUsoPrm;
	}

	public String getDePrm() {
		return this.dePrm;
	}

	public void setDePrm(String dePrm) {
		this.dePrm = dePrm;
	}

	public String getVlPrm() {
		return this.vlPrm;
	}

	public void setVlPrm(String vlPrm) {
		this.vlPrm = vlPrm;
	}

	public String getVlPsv() {
		return this.vlPsv;
	}

	public void setVlPsv(String vlPsv) {
		this.vlPsv = vlPsv;
	}

	public String getVlDft() {
		return vlDft;
	}

	public void setVlDft(String vlDft) {
		this.vlDft = vlDft;
	}

	public ArrayList<String> getListAsArrayList() {
		StringList myStringList = new StringList("|", this.vlPsv);
		return myStringList.getListAsArrayList();
	}

	public void setListAsArrayList(ArrayList<String> arrayList) {
		StringList myStringList = new StringList();
		myStringList.setListAsArrayList(arrayList);
		this.vlPsv = myStringList.getList();
	}
	
}