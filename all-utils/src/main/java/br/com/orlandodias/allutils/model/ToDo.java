package br.com.orlandodias.allutils.model;

import java.io.Serializable;
import java.util.Date;

public class ToDo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String activity;
	private String description;
	private Date open;
	private Date close;
	private String priority; // 1-High, 2-Medium, 3-Low
	private String area; // Database, Code
	private String type; // Wish, Error, Customer

	public static final String PRIORTY_HIGH = "1-High";
	public static final String PRIORTY_MEDIUM = "2-Medium";
	public static final String PRIORTY_LOW = "3-Low";

	public static final String AREA_DATABASE = "Database";
	public static final String AREA_CODE = "Code";

	public static final String TYPE_ERROR = "0-Error";
	public static final String TYPE_PROJECT = "1-Project";
	public static final String TYPE_CUSTOMER = "2-Customer";
	public static final String TYPE_WISH = "3-Wish";

	public ToDo() {
		super();
	}

	public ToDo(String activity, Date open, Date close, String priority, String area, String type) {
		super();
		this.activity = activity;
		this.open = open;
		this.close = close;
		this.priority = priority;
		this.area = area;
		this.type = type;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public Date getOpen() {
		return open;
	}

	public void setOpen(Date open) {
		this.open = open;
	}

	public Date getClose() {
		return close;
	}

	public void setClose(Date close) {
		this.close = close;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
