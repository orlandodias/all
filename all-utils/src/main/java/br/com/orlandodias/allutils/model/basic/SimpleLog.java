package br.com.orlandodias.allutils.model.basic;

import java.io.Serializable;
import java.util.Calendar;

import br.com.orlandodias.allutils.library.Util;

/*
 * Simple log for entity row
 * 
 * @author Orlando Dias
 * @version 1.0, April 2017 Thread: Not safe
 */
public class SimpleLog implements Serializable {
	private static final long serialVersionUID = 1L;

	private Calendar tsAlt;

	// @NotNull
	private Calendar tsInc;

	private String idUsuAlt;

	// @NotNull
	private String idUsuInc;

	public SimpleLog() {
		super();
	}

	public Calendar getTsAlt() {
		return tsAlt;
	}

	public String getTsAltAsString() {
		return Util.calendarToStrTimestamp(tsAlt);
	}

	public void setTsAlt(Calendar tsAlt) {
		this.tsAlt = tsAlt;
	}

	public Calendar getTsInc() {
		return tsInc;
	}

	public String getTsIncAsString() {
		return Util.calendarToStrTimestamp(tsInc);
	}

	public void setTsInc(Calendar tsInc) {
		this.tsInc = tsInc;
	}

	public String getIdUsuAlt() {
		return idUsuAlt;
	}

	public void setIdUsuAlt(String idUsuAlt) {
		this.idUsuAlt = idUsuAlt;
	}

	public String getIdUsuInc() {
		return idUsuInc;
	}

	public void setIdUsuInc(String idUsuInc) {
		this.idUsuInc = idUsuInc;
	}

}
