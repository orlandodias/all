package br.com.orlandodias.allutils.model.basic;

import org.apache.commons.lang3.StringUtils;

public class CpfCnpj {
	private String cdTipPes;
	private String numero;

	public static final String FISICA = "F";
	public static final String JURIDICA = "J";

	public CpfCnpj(String cdTipPes, String numero) {
		super();
		this.cdTipPes = cdTipPes;
		this.numero = numero;
	}

	public CpfCnpj() {
		super();
	}

	public String getCdTipPes() {
		return cdTipPes;
	}

	public void setCdTipPes(String cdTipPes) {
		this.cdTipPes = cdTipPes;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	/*
	 * fake properties
	 */
	public String getFormated() {
		return this.format();
	}
	
	public String getFormatProtected() {
		return this.formatProtected();
	}
	
	public Object getCpfCnpj() {
		if (FISICA.equalsIgnoreCase(cdTipPes)) {
			//012 345 678 90
			//123 456 789 01
			String cpfNumero = StringUtils.left(this.numero.trim(), 9);
			String cpfDv = StringUtils.right(this.numero.trim(), 2);
			Cpf cpf = new Cpf(cpfNumero, cpfDv);
			return cpf;
		} else {
			//01 234 567 8901 23
			//12 345 678 9012 34
			String cnpjRaiz = StringUtils.left(this.numero.trim(),8)  ;
			String cnpjFilial = StringUtils.mid(this.numero.trim(),9,4);
			String cnpjDv = StringUtils.right(this.numero.trim(),2);
			Cnpj cnpj = new Cnpj(cnpjRaiz, cnpjFilial, cnpjDv);
			return cnpj;
		}
	}

	public Long getCpfCnpjToLong() {
		if (FISICA.equalsIgnoreCase(cdTipPes)) {
			//012 345 678 90
			String cpfNumero = StringUtils.left(this.numero.trim(), 9);
			String cpfDv = StringUtils.right(this.numero.trim(), 2);
			Cpf cpf = new Cpf(cpfNumero, cpfDv);
			return cpf.toLong();
		} else {
			//01 234 567 8901 23
			String cnpjRaiz = StringUtils.left(this.numero.trim(),8)  ;
			String cnpjFilial = StringUtils.mid(this.numero.trim(),9,4);
			String cnpjDv = StringUtils.right(this.numero.trim(),2);
			Cnpj cnpj = new Cnpj(cnpjRaiz, cnpjFilial, cnpjDv);
			return cnpj.toLong();
		}
	}

	public String getCpfCnpjFormatted() {
		if (FISICA.equalsIgnoreCase(cdTipPes)) {
			//012 345 678 90
			String cpfNumero = StringUtils.left(this.numero.trim(), 9);
			String cpfDv = StringUtils.right(this.numero.trim(), 2);
			Cpf cpf = new Cpf(cpfNumero, cpfDv);
			
			return cpf.format();
		} else {
			//01 234 567 8901 23
			String cnpjRaiz = StringUtils.left(this.numero.trim(),8)  ;
			String cnpjFilial = StringUtils.mid(this.numero.trim(),9,4);
			String cnpjDv = StringUtils.right(this.numero.trim(),2);
			Cnpj cnpj = new Cnpj(cnpjRaiz, cnpjFilial, cnpjDv);

			return cnpj.format();
		}
	}
	
	/*
	 * utilities methods
	 */
	public String format() {
		StringBuffer formated = new StringBuffer("[");
		formated.append(cdTipPes);
		formated.append("] ");
		if ("F".equalsIgnoreCase(this.cdTipPes)) {
			Cpf myCpf = new Cpf(this.numero);
			formated.append(myCpf.format());
		} else {
			Cnpj myCnpj = new Cnpj(this.numero);
			formated.append(myCnpj.format());
		}
		return formated.toString();
	}
	
	public String formatProtected() {
		StringBuffer formated = new StringBuffer("[");
		formated.append(cdTipPes);
		formated.append("] ");
		if ("F".equalsIgnoreCase(this.cdTipPes)) {
			Cpf myCpf = new Cpf(this.numero);
			formated.append(myCpf.formatProtected());
		} else {
			Cnpj myCnpj = new Cnpj(this.numero);
			formated.append(myCnpj.formatProtected());
		}
		return formated.toString();
	}
}
