package br.com.orlandodias.allutils.library;

import org.apache.commons.lang3.StringUtils;

import br.com.orlandodias.allutils.exception.CpfCnpjLengthException;
import br.com.orlandodias.allutils.exception.CpfCnpjNotNumericException;

public class CpfCnpjUtil {
	public static final int[] pesoCPF = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 };
	public static final int[] pesoCNPJ = { 6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2 };

	public static int calcularDigito(String str, int[] peso) {
		int soma = 0;
		for (int indice = str.length() - 1, digito; indice >= 0; indice--) {
			digito = Integer.parseInt(str.substring(indice, indice + 1));
			soma += digito * peso[peso.length - str.length() + indice];
		}
		soma = 11 - soma % 11;
		return soma > 9 ? 0 : soma;
	}

	public static boolean isValidCPF(String cpf) throws CpfCnpjNotNumericException, CpfCnpjLengthException {
		/*
		 * Cpf nao preenchido � considerado v�lido. A l�gica para considerar obrigat�rio
		 * deve ser da aplica��o
		 */
		if (cpf == null) {
			return true;
		}

		/*
		 * retira formata��o
		 */
		cpf = cpf.replaceAll("\\.", "").replaceAll("\\-", "");

		/*
		 * Converte em inteiro
		 */
		try {
			@SuppressWarnings("unused")
			Long cpfLong = Long.parseLong(cpf);
		} catch (NumberFormatException e) {
			throw new CpfCnpjNotNumericException();
		}

		/*
		 * verifica cpfs fora da faixa de tamanho
		 */
		if (cpf.length()  > 11)
			throw new CpfCnpjLengthException();

		/*
		 * retira valores que passariam pela verifica��o do d�gito
		 */
		if ("11111111111".equals(cpf) || "22222222222".equals(cpf) || "33333333333".equals(cpf)
				|| "44444444444".equals(cpf) || "55555555555".equals(cpf) || "66666666666".equals(cpf)
				|| "77777777777".equals(cpf) || "88888888888".equals(cpf) || "99999999999".equals(cpf)) {
			return false;
		}

		/*
		 * completa com zeros a esquerda
		 */
		if (cpf.trim().length() < 11) {
			cpf = StringUtils.leftPad(cpf.trim(), 11, '0');
		}

		/*
		 * calcula e compara d�gitos
		 */
		Integer digito1 = calcularDigito(cpf.substring(0, 9), pesoCPF);
		Integer digito2 = calcularDigito(cpf.substring(0, 9) + digito1, pesoCPF);
		return cpf.equals(cpf.substring(0, 9) + digito1.toString() + digito2.toString());
	}

	public static boolean isValidCNPJ(String cnpj) throws CpfCnpjNotNumericException, CpfCnpjLengthException {
		/*
		 * Cpf nao preenchido � considerado v�lido. A l�gica para considerar obrigat�rio
		 * deve ser da aplica��o
		 */
		if ((cnpj == null))
			return true;

		/*
		 * retira formata��o
		 */
		cnpj = cnpj.replaceAll("\\.", "").replaceAll("\\-", "").replaceAll("\\/", "");

		/*
		 * Converte em inteiro
		 */
		try {
			@SuppressWarnings("unused")
			Long cpfLong = Long.parseLong(cnpj);
		} catch (NumberFormatException e) {
			throw new CpfCnpjNotNumericException();
		}

		/*
		 * verifica cnpjs fora da faixa de tamanho
		 */
		if (cnpj.length()  > 14)
			throw new CpfCnpjLengthException();

		/*
		 * completa com zeros a esquerda
		 */
		if (cnpj.trim().length() < 14) {
			cnpj = StringUtils.leftPad(cnpj.trim(), 14, '0');
		}
		Integer digito1 = calcularDigito(cnpj.substring(0, 12), pesoCNPJ);
		Integer digito2 = calcularDigito(cnpj.substring(0, 12) + digito1, pesoCNPJ);
		return cnpj.equals(cnpj.substring(0, 12) + digito1.toString() + digito2.toString());
	}

}
