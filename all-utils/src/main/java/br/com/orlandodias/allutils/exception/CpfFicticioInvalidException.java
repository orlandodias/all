package br.com.orlandodias.allutils.exception;

/**
 * @author orlando.dias
 * 
 * Quando o numero do CPF (ficticio) gera um CPF v�lido.
 * Para ser um CPF ficticio o CPF tem que:
 * 1) Gerar DV inv�lido
 * 2) Ter o formato 9NNNNNNN999  
 *
 */
public class CpfFicticioInvalidException extends Exception {
	
	private final static long serialVersionUID = 1;

	public CpfFicticioInvalidException() {
	}
}
