package br.com.orlandodias.allutils.library;

import java.util.HashMap;

public class TableNameList {
	private HashMap<String, String> table;

	public TableNameList() {
		super();
		this.table = new HashMap<String, String>();
	}

	public TableNameList(HashMap<String, String> table) {
		super();
		this.table = table;
	}

	public HashMap<String, String> getString() {
		return table;
	}

	public void setString(HashMap<String, String> table) {
		this.table = table;
	}

}
