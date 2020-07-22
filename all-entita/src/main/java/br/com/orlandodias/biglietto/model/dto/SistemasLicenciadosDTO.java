package br.com.orlandodias.biglietto.model.dto;

import java.io.Serializable;

import br.com.orlandodias.biglietto.model.Empresa;

public class SistemasLicenciadosDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Empresa empresa;
	private Integer qtSisLic;
	private Integer qtSisDsp;

	public SistemasLicenciadosDTO() {
		super();
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Integer getQtSisLic() {
		return qtSisLic;
	}

	public void setQtSisLic(Integer qtSisLic) {
		this.qtSisLic = qtSisLic;
	}

	public Integer getQtSisDsp() {
		return qtSisDsp;
	}

	public void setQtSisDsp(Integer qtSisDsp) {
		this.qtSisDsp = qtSisDsp;
	}

}
