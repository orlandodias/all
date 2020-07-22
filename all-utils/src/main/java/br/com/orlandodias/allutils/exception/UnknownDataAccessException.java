package br.com.orlandodias.allutils.exception;

public class UnknownDataAccessException extends DataAccessException {
	private static final long serialVersionUID = 1L;

	public UnknownDataAccessException(Throwable cause) {
		super(cause);
	}
}