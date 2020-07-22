package br.com.orlandodias.allutils.model;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public class StringList {
	private String charSep;
	private String list;

	public StringList() {
		super();
	}

	public StringList(String charSep, String list) {
		super();
		this.charSep = charSep;
		this.list = list;
	}

	public String getCharSep() {
		return charSep;
	}

	public void setCharSep(String charSep) {
		this.charSep = charSep;
	}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}

	public ArrayList<String> getListAsArrayList() {
		String[] myList = list.split("\\" + charSep);
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(myList));
		return arrayList;
	}

	public void setListAsArrayList(ArrayList<String> arrayList) {
		Object[] objArray = arrayList.toArray();
		this.list = StringUtils.join(objArray, this.charSep);
	}

}
