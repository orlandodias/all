package br.com.orlandodias.allutils.model;

import java.io.Serializable;

public class BasicSystemUsageInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String cdSis;
	private Integer cdEmp;
	private LogInfo logInfo;

	public BasicSystemUsageInfo() {
		super();
		this.logInfo = new LogInfo();
	}

	public BasicSystemUsageInfo(String cdSis, Integer cdEmp) {
		super();
		this.cdSis = cdSis;
		this.cdEmp = cdEmp;
		this.logInfo = new LogInfo();
	}

	public String getCdSis() {
		return cdSis;
	}

	public void setCdSis(String cdSis) {
		this.cdSis = cdSis;
	}

	public Integer getCdEmp() {
		return cdEmp;
	}

	public void setCdEmp(Integer cdEmp) {
		this.cdEmp = cdEmp;
	}

	public LogInfo getLogInfo() {
		return logInfo;
	}

	public void setLogInfo(LogInfo logInfo) {
		this.logInfo = logInfo;
	}

	@Override
	public String toString() {
		return "BasicSystemUsageInfo [cdSis=" + cdSis + ", cdEmp=" + cdEmp + ", logInfo=" + logInfo + "]";
	}

}
