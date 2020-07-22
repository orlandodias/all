package br.com.orlandodias.allutils.exception;

public class ConstraintViolationException extends DataAccessException {
	private static final long serialVersionUID = 1L;

	public ConstraintViolationException(Throwable cause) {
		super(cause);
	}
}
