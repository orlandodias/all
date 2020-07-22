package br.com.orlandodias.allutils.library;

public class UtilBoolean {

	public static String getAsTF(Boolean flag) {
		if (flag) {
			return "T";
		} else {
			return "F";
		}
	}

	public static String getAsSN(Boolean flag) {
		if (flag) {
			return "S";
		} else {
			return "N";
		}
	}

	public static Integer getAsInteger(Boolean flag) {
		if (flag) {
			return 1;
		} else {
			return 0;
		}
	}

	public static Boolean setTF(String flag) {
		if (flag == null) {
			return false;
		} else if ("T".equals(flag)) {
			return true;
		} else {
			return false;
		}
	}

	public static Boolean setSN(String flag) {
		if (flag == null) {
			return false;
		} else if ("S".equals(flag)) {
			return true;
		} else {
			return false;
		}
	}

}