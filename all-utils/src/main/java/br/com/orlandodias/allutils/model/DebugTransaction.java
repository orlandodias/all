package br.com.orlandodias.allutils.model;

public class DebugTransaction {
	public static void show(String classN, String methodN, String localN, String comm) {
		String className = classN;
		String methodName = methodN;
		String local = localN;
		String comment = comm;
		StringBuffer sb = new StringBuffer(">=>=>=>=>=>=>=>=>=>=>=>= ");
		sb.append(className);
		sb.append(".");
		sb.append(methodName);
		sb.append(".");
		sb.append(local);
		if (comment != null) {
			sb.append(".");
			sb.append(comment);
		}
		System.out.println(sb.toString());
	}
}
