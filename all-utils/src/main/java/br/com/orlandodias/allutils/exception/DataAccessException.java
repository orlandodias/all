package br.com.orlandodias.allutils.exception;

public class DataAccessException extends Exception {
	private static final long serialVersionUID = 1L;

	public DataAccessException(String msg) {
		super(msg);
	}

	public DataAccessException(Throwable cause) {
		super(cause);
	}
}
