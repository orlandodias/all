package br.com.orlandodias.allutils.exception;

public class ApplicationException extends Exception {
	private final static long serialVersionUID = 1;

	private int codigo;

	public ApplicationException(Exception e) {
		super(e);
	}

	public ApplicationException() {
	}

	public ApplicationException(String msg) {
		super(msg);
	}

	public ApplicationException(int codigo, String msg) {
		super(msg);
		this.codigo = codigo;
	}

	public int getCodigoDeErro() {
		return codigo;
	}
}
