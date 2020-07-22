package br.com.orlandodias.allutils.model.basic;

import java.io.Serializable;
import java.util.HashMap;

public class DaoFilter implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer qtMaxList;
	private String orderByColumn;
	private String idSssExt;
	private HashMap<String, Object> parms;
	
	private Integer STANDARD_QTMAXLIST = 50;

	public DaoFilter() {
		super();
		this.qtMaxList = STANDARD_QTMAXLIST;
		this.orderByColumn = null;
		this.parms = new HashMap<String, Object>();
	}

	public DaoFilter(Integer qtMaxList, String orderByColumn, String idSssExt) {
		super();
		this.qtMaxList = qtMaxList;
		this.orderByColumn = orderByColumn;
		this.idSssExt = idSssExt;
		this.parms = new HashMap<String, Object>();
	}

	public DaoFilter(Integer qtMaxList, String orderByColumn, HashMap<String, Object> parms) {
		super();
		this.qtMaxList = qtMaxList;
		this.orderByColumn = orderByColumn;
		this.parms = parms;
	}

	public Integer getQtMaxList() {
		return qtMaxList;
	}

	public void setQtMaxList(Integer qtMaxList) {
		this.qtMaxList = qtMaxList;
	}

	public String getOrderByColumn() {
		return orderByColumn;
	}

	public void setOrderByColumn(String orderByColumn) {
		this.orderByColumn = orderByColumn;
	}

	public HashMap<String, Object> getParms() {
		return parms;
	}

	public void setParms(HashMap<String, Object> parms) {
		this.parms = parms;
	}

	public String getIdSssExt() {
		return idSssExt;
	}

	public void setIdSssExt(String idSssExt) {
		this.idSssExt = idSssExt;
	}

}
