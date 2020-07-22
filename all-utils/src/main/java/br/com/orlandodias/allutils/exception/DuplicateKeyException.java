package br.com.orlandodias.allutils.exception;

public class DuplicateKeyException extends Exception {
	private final static long serialVersionUID = 1;
	private String columnName;

	public DuplicateKeyException() {
		this.columnName = null;
	}

	public DuplicateKeyException(String columnName) {
		this.columnName = columnName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
}
