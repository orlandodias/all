package br.com.orlandodias.allutils.exception;

public class InfrastructureException extends RuntimeException {
	private final static long serialVersionUID = 1L;

	public InfrastructureException(Exception e) {
		super(e);
	}

	public InfrastructureException(String msg) {
		super(msg);
	}
}