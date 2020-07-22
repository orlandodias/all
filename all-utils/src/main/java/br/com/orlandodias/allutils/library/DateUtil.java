package br.com.orlandodias.allutils.library;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtil {
	public static Long dateDiff(Calendar dtIni, Calendar dtFim) {
		Long diff = dtFim.getTimeInMillis() - dtIni.getTimeInMillis();
		return (diff / (24 * 60 * 60 * 1000));
	}

	public static Integer dateDiffAsInteger(Calendar dtIni, Calendar dtFim) {
		Long diff = dateDiff(dtIni, dtFim);
		return diff.intValue();
	}

	public static Calendar addDays(Calendar dtIni, Integer days) {
		Calendar c = Calendar.getInstance();
		c.setTime(dtIni.getTime());
		c.add(Calendar.DATE, days);

		return c;
	}

	public static GregorianCalendar addDaysAsGregorianCalendar(Calendar dtIni, Integer days) {
		GregorianCalendar c = (GregorianCalendar) addDays( dtIni,  days);
		return c;
	}

}
