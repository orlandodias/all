package br.com.orlandodias.allutils.library;

public class DVUtil {

	public static int getMod11(String num) {
		return getMod11(num, 9, 0);
	}

	public static int getMod11(String num, int base, int r) {
		/**
		 * Autor: Douglas Tybel <dtybel@yahoo.com.br>
		 *
		 * Função: Calculo do Modulo 11 para geracao do digito verificador de
		 * boletos bancarios conforme documentos obtidos da Febraban -
		 * www.febraban.org.br
		 *
		 * Entrada: $num: string numérica para a qual se deseja calcularo digito
		 * verificador; $base: valor maximo de multiplicacao [2-$base] $r:
		 * quando especificado um devolve somente o resto
		 *
		 * Saída: Retorna o Digito verificador.
		 *
		 * Observações: - Script desenvolvido sem nenhum reaproveitamento de
		 * código existente. - Script original de Pablo Costa
		 * <pablo@users.sourceforge.net> - Transportado de php para java -
		 * Exemplo de uso: getMod11(nossoNumero, 9,1) - 9 e 1 são fixos de
		 * acordo com a base - Assume-se que a verificação do formato das
		 * variáveis de entrada é feita antes da execução deste script.
		 */

		int soma = 0;
		int fator = 2;
		String[] numeros, parcial;
		numeros = new String[num.length() + 1];
		parcial = new String[num.length() + 1];
		/* Separacao dos numeros */
		for (int i = num.length(); i > 0; i--) {
			// pega cada numero isoladamente
			numeros[i] = num.substring(i - 1, i);
			// Efetua multiplicacao do numero pelo falor
			parcial[i] = String.valueOf(Integer.parseInt(numeros[i]) * fator);
			// Soma dos digitos
			soma += Integer.parseInt(parcial[i]);
			if (fator == base) {
				// restaura fator de multiplicacao para 2
				fator = 1;
			}
			fator++;
		}
		/* Calculo do modulo 11 */
		if (r == 0) {
			soma *= 10;
			int digito = soma % 11;
			if (digito == 10) {
				digito = 0;
			}
			return digito;
		} else {
			int resto = soma % 11;
			return resto;
		}
	}
}
