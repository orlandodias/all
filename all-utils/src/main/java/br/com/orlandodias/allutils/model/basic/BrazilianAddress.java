package br.com.orlandodias.allutils.model.basic;

import java.io.Serializable;
import java.util.ArrayList;

public class BrazilianAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	// @BMViewField(size=60, maxLength=60)
	private String deLgr;

	// @BMViewField(size=15, maxLength=15)
	private String nuEnd;

	// @BMViewField(size=60, maxLength=60)
	private String deCpl;

	private Cep cep;

	// @BMViewField(size=30, maxLength=30)
	private String deBrr;

	// @BMViewField(size=30, maxLength=30)
	private String deCid;

	// @BMViewField(size=2, maxLength=2)
	private String cdUfx;

	public BrazilianAddress() {
		super();
		this.cep = new Cep();
	}

	public String getDeLgr() {
		return deLgr;
	}

	public void setDeLgr(String deLgr) {
		this.deLgr = deLgr;
	}

	public String getNuEnd() {
		return nuEnd;
	}

	public void setNuEnd(String nuEnd) {
		this.nuEnd = nuEnd;
	}

	public String getDeCpl() {
		return deCpl;
	}

	public void setDeCpl(String deCpl) {
		this.deCpl = deCpl;
	}

	public Cep getCep() {
		return cep;
	}

	public void setCep(Cep cep) {
		this.cep = cep;
	}

	public String getDeBrr() {
		return deBrr;
	}

	public void setDeBrr(String deBrr) {
		this.deBrr = deBrr;
	}

	public String getDeCid() {
		return deCid;
	}

	public void setDeCid(String deCid) {
		this.deCid = deCid;
	}

	public String getCdUfx() {
		return cdUfx;
	}

	public void setCdUfx(String cdUfx) {
		this.cdUfx = cdUfx;
	}

	public ArrayList<String> toLabel() {
		ArrayList<String> myLabel = new ArrayList<String>();
		ArrayList<String> myLine = new ArrayList<String>();

		//1st Line
		myLine.add(deLgr);
		myLine.add( " ");
		myLine.add(nuEnd);
		myLine.add( " ");
		myLine.add(deCpl);
		myLabel.add(myLine.toString());

		//2nd Line
		myLine = new ArrayList<String>();
		myLine.add(deBrr);
		myLine.add( " / ");
		myLine.add(deCid);
		myLine.add( " / ");
		myLine.add(cdUfx);
		myLabel.add(myLine.toString());

		//3rd Line
		myLine = new ArrayList<String>();
		myLine.add(cep.toString());
		myLabel.add(myLine.toString());

		return myLabel;
	}

}
