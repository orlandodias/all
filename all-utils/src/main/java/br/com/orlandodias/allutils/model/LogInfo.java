package br.com.orlandodias.allutils.model;

public class LogInfo {
	private String idUsu;
	private Integer idSssInt;
	private String idSssExt;

	public LogInfo() {
		super();
	}

	public String getIdUsu() {
		return idUsu;
	}

	public void setIdUsu(String idUsu) {
		this.idUsu = idUsu;
	}

	public Integer getIdSssInt() {
		return idSssInt;
	}

	public void setIdSssInt(Integer idSssInt) {
		this.idSssInt = idSssInt;
	}

	public String getIdSssExt() {
		return idSssExt;
	}

	public void setIdSssExt(String idSssExt) {
		this.idSssExt = idSssExt;
	}

	@Override
	public String toString() {
		return "LogInfo [idUsu=" + idUsu + ", idSssInt=" + idSssInt + ", idSssExt=" + idSssExt + "]";
	}
}
