package br.com.orlandodias.biglietto.model;

import br.com.orlandodias.allutils.library.Util;

import java.io.Serializable;
import java.util.Calendar;

public class SisUsu implements Serializable {
	private static final long serialVersionUID = 1L;
	private Sistema sistema;
	private Empresa empresa;
	private Usuario usuario;
	private Long idSssInt;
	private Calendar tsAcsIni;
	private Calendar tsAcsFim;
	private Calendar tsAcsUlt;
	private String idSssExt;
	private String idSssDtb;

	public SisUsu() {
		super();
	}

	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getIdSssInt() {
		return idSssInt;
	}

	public void setIdSssInt(Long idSssInt) {
		this.idSssInt = idSssInt;
	}

	public Calendar getTsAcsIni() {
		return tsAcsIni;
	}

	public void setTsAcsIni(Calendar tsAcsIni) {
		this.tsAcsIni = tsAcsIni;
	}

	public String getTsAcsIniAsString() {
		return Util.calendarToStrDateTime(this.tsAcsIni);
	}

	public Calendar getTsAcsFim() {
		return tsAcsFim;
	}

	public void setTsAcsFim(Calendar tsAcsFim) {
		this.tsAcsFim = tsAcsFim;
	}

	public String getTsAcsFimAsString() {
		return Util.calendarToStrDateTime(this.tsAcsFim);
	}

	public Calendar getTsAcsUlt() {
		return tsAcsUlt;
	}

	public void setTsAcsUlt(Calendar tsAcsUlt) {
		this.tsAcsUlt = tsAcsUlt;
	}

	public String getTsAcsUltAsString() {
		return Util.calendarToStrDateTime(this.tsAcsUlt);
	}

	public String getIdSssExt() {
		return idSssExt;
	}

	public void setIdSssExt(String idSssExt) {
		this.idSssExt = idSssExt;
	}

	public String getIdSssDtb() {
		return idSssDtb;
	}

	public void setIdSssDtb(String idSssDtb) {
		this.idSssDtb = idSssDtb;
	}

	public Long getEllapsedTime() {
		Calendar now = Calendar.getInstance();
		return now.getTimeInMillis() - this.tsAcsIni.getTimeInMillis();
	}

	public String getEllapsedTimeAsString() {
		Long diff = getEllapsedTime();
		Long diffSeconds = diff / 1000 % 60;
		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000) % 24;

		StringBuilder sbResult = new StringBuilder();
		if (diffHours > 0) {
			sbResult.append(diffHours);
			sbResult.append("h ");
		}
		if (diffMinutes > 0) {
			sbResult.append(diffMinutes);
			sbResult.append("m ");
		}
		if (diffSeconds > 0) {
			sbResult.append(diffSeconds);
			sbResult.append("s");
		} else {
			sbResult.append(diffSeconds);
			sbResult.append("0s");
		}

		return sbResult.toString();
	}
}
