package br.com.orlandodias.allutils.library;

public class EmailUtil {
	public static String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public static String hideEmailString(String deMail) {
		String result = deMail;
		String[] terms = deMail.split("@");

		if (terms[0].trim().length() <= 5) {
			terms[0] = "***";
		} else {
			terms[0] = terms[0].trim().substring(0, 1) + "***"
					+ terms[0].trim().substring(terms[0].trim().length() - 2, terms[0].trim().length());
		}

		result = terms[0] + "@" + terms[1];
		return result;
	}
}
