package br.com.orlandodias.allutils.exception;

public class LoginException extends Exception {
	private final static long serialVersionUID = 1;

	private int codigo;

	public LoginException(Exception e) {
		super(e);
	}

	public LoginException() {
	}

	public LoginException(int codigo) {
		this.codigo = codigo;
	}

	public LoginException(int codigo, String msg) {
		super(msg);
		this.codigo = codigo;
	}

	public int getCodigoDeErro() {
		return codigo;
	}
}
