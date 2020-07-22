package br.com.orlandodias.allutils.library;

public class BeanMakerUtil {
	private static String tab = "\t";

	public static String startLine(Integer tabs) {
		StringBuffer sb = new StringBuffer("\n");
		for (int i = 0; i < tabs; i++) {
			sb.append(tab);
		}
		return sb.toString();
	}

}
