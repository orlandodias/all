package br.com.orlandodias.allutils.library;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Pattern;

public class Util {
	private static SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat sdfDateYMD = new SimpleDateFormat("yyyy/MM/dd");
	private static SimpleDateFormat sdfDateTime = new SimpleDateFormat("HH:mm:ss");
	private static NumberFormat nf;
	private static NumberFormat nf1;
	public static String TAB = "\t";

	static {
		nf1 = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
		nf1.setMaximumFractionDigits(2); // O default EH 3.
		nf1.setMinimumFractionDigits(2);
		nf1.setMinimumIntegerDigits(1);
		nf1.setGroupingUsed(false);

		// NumberFormat nf = NumberFormat.getNumberInstance();
		// NumberFormat nf = NumberFormat.getCurrencyInstance();

		nf = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
		nf.setMaximumFractionDigits(2); // O default � 3.
		nf.setMinimumFractionDigits(2);
	}

	public static String startLine(Integer tabs) {
		StringBuffer sb = new StringBuffer("\n");
		for (int i = 0; i < tabs; i++) {
			sb.append(TAB);
		}
		return sb.toString();
	}

	public static String capitalize(String text) {
		return Character.toUpperCase(text.charAt(0)) + text.substring(1);
	}

	public static String uncapitalize(String text) {
		return Character.toLowerCase(text.charAt(0)) + text.substring(1);
	}

	public static boolean dataValida(String umaData) {
		try {
			if (umaData.length() != 10)
				return false;
			Integer.parseInt(umaData.substring(0, 2));
			if (!umaData.substring(2, 3).equals("/"))
				return false;
			Integer.parseInt(umaData.substring(3, 5));
			if (!umaData.substring(5, 6).equals("/"))
				return false;
			Integer.parseInt(umaData.substring(6, 10));

			sdfDate.setLenient(false);
			sdfDate.parse(umaData);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static Calendar getSystemDate() {
		Date d = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(d);
		return cal;
	}

	public static String[] ArrayList2String(ArrayList<String> list) {
		String[] myList;
		if (list == null) {
			myList = new String[0];
		} else {
			myList = new String[list.size()];
			int i = 0;
			for (String myElem : list) {
				myList[i++] = myElem;
			}
		}

		return myList;
	}

	public static boolean horaValida(String umaHora) {
		try {
			int hora = Integer.parseInt(umaHora.substring(0, umaHora.indexOf(':')));
			if (hora < 0 || hora > 23) {
				return false;
			}
			int min = Integer.parseInt(umaHora.substring(umaHora.length() - 2));
			if (min < 0 || min > 59) {
				return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static Date strToDate(String umaData) {
		int dia = Integer.parseInt(umaData.substring(0, 2));
		int mes = Integer.parseInt(umaData.substring(3, 5));
		int ano = Integer.parseInt(umaData.substring(6, 10));

		GregorianCalendar data = new GregorianCalendar(ano, mes - 1, dia);
		return data.getTime();
	}

	public static Date strToDateWithTime(String umaData) {
		int dia = Integer.parseInt(umaData.substring(0, 2));
		int mes = Integer.parseInt(umaData.substring(3, 5));
		int ano = Integer.parseInt(umaData.substring(6, 10));
		int hora = Integer.parseInt(umaData.substring(11, 13));
		int min = Integer.parseInt(umaData.substring(14, 16));

		GregorianCalendar data = new GregorianCalendar(new Locale("pt", "BR"));
		data.set(ano, mes - 1, dia, hora, min, 00);

		return data.getTime();
	}

	public static Calendar strToCalendar(String umaData) {
		int dia = Integer.parseInt(umaData.substring(0, 2));
		int mes = Integer.parseInt(umaData.substring(3, 5));
		int ano = Integer.parseInt(umaData.substring(6, 10));

		Calendar data = new GregorianCalendar(ano, mes - 1, dia);
		return data;
	}

	public static Calendar strToCalendarWithTime(String umaData) {
		int dia = Integer.parseInt(umaData.substring(0, 2));
		int mes = Integer.parseInt(umaData.substring(3, 5));
		int ano = Integer.parseInt(umaData.substring(6, 10));
		int hora = Integer.parseInt(umaData.substring(11, 13));
		int min = Integer.parseInt(umaData.substring(14, 16));

		Calendar data = new GregorianCalendar(new Locale("pt", "BR"));
		data.set(ano, mes - 1, dia, hora, min, 00);
		data.set(Calendar.MILLISECOND, 0);

		return data;
	}

	public static String calendarToStr(Calendar umaData) {
		if (umaData == null)
			return "";
		else
			return sdfDate.format(umaData.getTime());
	}

	public static String calendarToStrYMD(Calendar umaData) {
		if (umaData == null)
			return "";
		else
			return sdfDateYMD.format(umaData.getTime());
	}

	public static String calendarToStrDateTime(Calendar umaData) {
		if (umaData == null)
			return "";
		else
			return sdfDateTime.format(umaData.getTime());
	}

	public static String calendarToStrTimestamp(Calendar umaData) {
		if (umaData == null)
			return "";
		else {
			StringBuffer myDate = new StringBuffer(sdfDate.format(umaData.getTime()));
			myDate.append(" ");
			myDate.append(sdfDateTime.format(umaData.getTime()));

			return myDate.toString();
		}
	}

	public static String calendarToStrImpressao(Calendar umaData) {
		if (umaData == null)
			return "";
		else {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			return sdf.format(umaData.getTime());
		}
	}

	public static String calendarToTimeImpressao(Calendar umaData) {
		if (umaData == null)
			return "";
		else {
			SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
			return sdf.format(umaData.getTime());
		}
	}

	public static String calendarToTimeStr(Calendar umaData) {
		if (umaData == null)
			return "";
		else {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			return sdf.format(umaData.getTime());
		}
	}

	public static String dateToStr(Date umaData) {
		if (umaData == null)
			return "";
		else {
			return sdfDate.format(umaData);
		}
	}

	public static Double strToValorMonetario(String valor) throws Exception {
		// Mesmo especificando um Locale pt-BR na cria��o do NumberFormat,
		// se digitarmos o n�mero 2,000.00 o m�todo parse n�o d� erro.
		// Da� ter
		// sido
		// acrescentada a express�o regular para verificar se � poss�vel
		// converter o
		// String em um valor monet�rio. Se n�o for poss�vel converter
		// ocorrer�
		// um
		// erro de convers�o. Observe que o valor monet�rio n�o pode ser
		// digitado
		// com separador de milhar.

		// 9999999,99 ou 999,99 ou 999.999,99 ou 9.999.999,99
		if (Pattern.compile(
				"^(\\d{1,7}(,\\d{2})?|\\d{1,3}(,\\d{2})?|\\d{1,3}[.]\\d{3}(,\\d{2})?|\\d{1}([.]\\d{3}){2}(,\\d{2})?)$")
				.matcher(valor).matches()) {
			return nf.parse(valor).doubleValue();
		}

		throw new Exception("Convers�o inv�lida");
	}

	public static String valorMonetarioToStr(Double valor) {
		String s = nf1.format(valor);
		// if (s.length() - s.indexOf(",") < 3 ) {
		// s += "0";
		// }

		return s;
	}

	public static String converteEmMes(int mes) {
		switch (mes) {
		case 1:
			return "Janeiro";
		case 2:
			return "Fevereiro";
		case 3:
			return "Mar�o";
		case 4:
			return "Abril";
		case 5:
			return "Maio";
		case 6:
			return "Junho";
		case 7:
			return "Julho";
		case 8:
			return "Agosto";
		case 9:
			return "Setembro";
		case 10:
			return "Outubro";
		case 11:
			return "Novembro";
		case 12:
			return "Dezembro";
		default:
			return null;
		}
	}

	public static String recuperaApenasOsDigitos(String s) {
		StringBuffer apenasDigitos = new StringBuffer();
		char c;

		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (Character.isDigit(c))
				apenasDigitos.append(c);
		}

		return apenasDigitos.toString();
	}

	public static String mascaraIP(String ip) {
		if (!ip.equals("")) {
			String mask = ip.substring(0, 3);
			mask += ".";
			mask += ip.substring(3, 6);
			mask += ".";
			mask += ip.substring(6, 9);
			mask += ".";
			mask += ip.substring(9);
			return mask;

		} else {
			return "";
		}
	}

	public static String mascaraCEP(String cep) {
		if (!cep.equals("")) {
			String mask = cep.substring(0, 5);
			mask += "-";
			mask += cep.substring(5);
			return mask;

		} else {
			return "";
		}
	}

	public static String mascaraMatricula(String mascara) {
		if (!mascara.equals("")) {
			String mask = mascara.substring(0, 3);
			mask += ".";
			mask += mascara.substring(3, 6);
			mask += "-";
			mask += mascara.substring(6);
			return mask;

		} else {
			return "";
		}
	}

	public static String mascaraCnpjCpf(String cnpjCpf) {
		if (!cnpjCpf.equals("")) {
			String mask = null;
			cnpjCpf = recuperaApenasOsDigitos(cnpjCpf);
			if (cnpjCpf.length() == 11) {
				mask = cnpjCpf.substring(0, 3);
				mask += ".";
				mask += cnpjCpf.substring(3, 6);
				mask += ".";
				mask += cnpjCpf.substring(6, 9);
				mask += "-";
				mask += cnpjCpf.substring(9);

			} else if (cnpjCpf.length() == 14) {
				mask = cnpjCpf.substring(0, 2);
				mask += ".";
				mask += cnpjCpf.substring(2, 5);
				mask += ".";
				mask += cnpjCpf.substring(5, 8);
				mask += "/";
				mask += cnpjCpf.substring(8, 12);
				mask += "-";
				mask += cnpjCpf.substring(12);
			}
			return mask;

		} else {
			return "";
		}
	}

	public static String mascaraInscricaoMunicipal(String inscricao) {
		if (!inscricao.equals("")) {
			String mask = inscricao.substring(0, 1);
			mask += ".";
			mask += inscricao.substring(1, 4);
			mask += ".";
			mask += inscricao.substring(4, 7);
			mask += "-";
			mask += inscricao.substring(7);
			return mask;

		} else {
			return "";
		}
	}

	public static String mascaraProcesso(String processo) {
		if (!processo.equals("")) {
			String mask = processo.substring(0, 2);
			mask += "/";
			mask += processo.substring(2, 5);
			mask += ".";
			mask += processo.substring(5, 8);
			mask += "/";
			mask += processo.substring(8);
			return mask;

		} else {
			return "";
		}
	}

	public static Calendar dateToCalendar(Date date) {
		if (date != null) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			return calendar;
		} else {
			return null;
		}
	}

	// Convert Calendar to Date
	public static Date calendarToDate(Calendar calendar) {
		return calendar.getTime();
	}

	public static Calendar getDataAtual() {
		Date dataAtual = new Date(System.currentTimeMillis());
		Calendar calendar = new GregorianCalendar(new Locale("pt", "BR"));
		calendar.setTime(dataAtual);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);

		return calendar;
	}

	public static int moduloDez(String numero) {

		char[] array = numero.toCharArray();
		int soma = 0;

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				soma += Integer.valueOf(String.valueOf(array[i]));
			} else {
				int mult = Integer.valueOf(String.valueOf(array[i])) * 2;
				if (mult > 9) {
					soma += 1 + (mult - 10);
				} else {
					soma += mult;
				}

			}
		}

		int resultado;
		if (soma % 10 == 0) {
			resultado = 0;
		} else {
			resultado = 10 - soma % 10;
		}

		return resultado;
	}

	public static String getFormatedLine(String template, String[] fields) {
		String textMessage = template;

		MessageFormat formatter = new MessageFormat(textMessage);
		String finalText = formatter.format(fields);

		return finalText;
	}

	public static boolean isNumeric(String str) {
		try {
			@SuppressWarnings("unused")
			double d = Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static String removeDuplicateSpaces(String text) {
		String myText = text;
		while (myText.contains("  ")) {
			myText = myText.replaceAll("(  )+", " ");
		}
		myText.trim();
		return myText;
	}

	public static String chopChar(String text, String lastChar) {
		String myText = text.trim();
		myText.replaceAll("\n", "");
		myText = Util.removeDuplicateSpaces(myText);
		myText.trim();
		String myLastChar = myText.substring(myText.length() - 1);
		System.out.println("chopChar: myLastChar: " + myLastChar);
		System.out.println("chopChar: myText: " + myText);
		System.out.println("chopChar: myText.length(): " + (myText.length()));
		if (lastChar.equals(myText.substring(myText.length() - 1))) {
			myText = myText.substring(0, myText.length() - 1).trim();
		}

		return myText;
	}

	/**
	 * @param in   The Long value
	 * @param fill The number of digits to fill
	 * @return The given value left padded with the given number of digits
	 */
	public static String lPadZero(Long in, int fill) {

		boolean negative = false;
		int len = 0;
		long value = 0;

		if (in >= 0) {
			value = in;
		} else {
			negative = true;
			value = -in;
			in = -in;
			len++;
		}

		if (value == 0) {
			len = 1;
		} else {
			for (; value != 0; len++) {
				value /= 10;
			}
		}

		StringBuilder sb = new StringBuilder();

		if (negative) {
			sb.append('-');
		}

		for (int i = fill; i > len; i--) {
			sb.append('0');
		}

		sb.append(in);

		return sb.toString();
	}

	@Deprecated
	// em favor de StringUtils.leftPad
	public static String leftPad(String originalString, int length, char padCharacter) {
		StringBuilder sb = new StringBuilder();
		while (sb.length() + originalString.length() < length) {
			sb.append(padCharacter);
		}
		sb.append(originalString);
		String paddedString = sb.toString();
		return paddedString;
	}

	public String boolean2String(Boolean b) {
		String result;
		if (b == true) {
			result = "S";
		} else {
			result = "N";
		}
		return result;
	}

}