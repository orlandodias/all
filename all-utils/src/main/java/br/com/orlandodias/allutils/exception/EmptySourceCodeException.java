package br.com.orlandodias.allutils.exception;

public class EmptySourceCodeException extends Exception {
	private final static long serialVersionUID = 1;

	public EmptySourceCodeException(Exception e) {
		super(e);
	}

	public EmptySourceCodeException() {
	}

	public EmptySourceCodeException(String msg) {
		super(msg);
	}
}
