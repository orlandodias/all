package br.com.orlandodias.allutils.model.basic;

import org.apache.commons.lang3.StringUtils;

import br.com.orlandodias.allutils.exception.CpfCnpjLengthException;
import br.com.orlandodias.allutils.exception.CpfCnpjNotNumericException;
import br.com.orlandodias.allutils.exception.CpfFicticioInvalidException;
import br.com.orlandodias.allutils.library.CpfCnpjUtil;

public class CpfFicticio extends Cpf {
	private static final long serialVersionUID = 1L;

	public CpfFicticio(Integer numero)
			throws CpfCnpjNotNumericException, CpfCnpjLengthException, CpfFicticioInvalidException {
		super();
		StringBuffer sbNumero = new StringBuffer("9");
		sbNumero.append(StringUtils.leftPad(numero.toString().trim(),7,"0"));
		sbNumero.append("9");

		this.setNumero(Integer.parseInt(sbNumero.toString()));
		this.setDv(99);
		if (this.isValid()) {
			throw new CpfFicticioInvalidException();
		}
	}

	public CpfFicticio(String numero, Boolean ficticio) {
		super();
		StringBuffer sbNumero = new StringBuffer("9");
		sbNumero.append(StringUtils.leftPad(numero.trim(),7));
		sbNumero.append("9");
		this.setNumero(Integer.parseInt(sbNumero.toString()));
		this.setDv(99);
	}
	public CpfFicticio() {
		super();
		this.setDv(99);
	}

	public Integer getDv() {
		return 99;
	}

	public String getDvAsString() {
		return "99";
	}

	public Boolean isValid() throws CpfCnpjNotNumericException, CpfCnpjLengthException {
		return CpfCnpjUtil.isValidCPF(this.toString());
	}

}
