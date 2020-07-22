package br.com.orlandodias.allutils.model.basic;

import java.io.Serializable;
import java.text.ParseException;

import javax.swing.text.MaskFormatter;

import org.apache.commons.lang3.StringUtils;

import br.com.orlandodias.allutils.exception.CnpjLengthException;
import br.com.orlandodias.allutils.exception.CnpjNotNumericException;
import br.com.orlandodias.allutils.exception.CnpjOutOfRangeException;
import br.com.orlandodias.allutils.exception.CpfCnpjLengthException;
import br.com.orlandodias.allutils.exception.CpfCnpjNotNumericException;
import br.com.orlandodias.allutils.library.CpfCnpjUtil;

public class Cnpj implements Serializable {
	private static final long serialVersionUID = 187221186168732194L;
	private Integer raiz;
	private Integer filial;
	private Integer dv;

	public static Integer CNPJ_MIN_VALUE = 1000000;
	public static Long CNPJ_MAX_VALUE = 99999999999999L;

	public Cnpj(Integer raiz, Integer filial, Integer dv) {
		super();
		this.raiz = raiz;
		this.filial = filial;
		this.dv = dv;
	}

	public Cnpj(String raiz, String filial, String dv) {
		super();
		this.raiz = Integer.parseInt(raiz);
		this.filial = Integer.parseInt(filial);
		this.dv = Integer.parseInt(dv);
	}

	public Cnpj(Long numero) {
		super();
		// 01234567-8901-23
		String cnpjStr = StringUtils.leftPad(numero.toString().trim(), 14, "0");
		String raizStr = StringUtils.left(cnpjStr, 8);
		String numStr = StringUtils.mid(cnpjStr, 8, 4);
		String dvStr = StringUtils.right(cnpjStr, 2);

		this.raiz = Integer.parseInt(raizStr);
		this.filial = Integer.parseInt(numStr);
		this.dv = Integer.parseInt(dvStr);
	}

	public Cnpj(String numero) {
		super();
		// 01234567-8901-23
		this.setAsString(numero);
	}

	public Cnpj() {
		super();
	}

	public Integer getRaiz() {
		return raiz;
	}

	public void setRaiz(Integer raiz) {
		this.raiz = raiz;
	}

	public Integer getFilial() {
		return filial;
	}

	public void setFilial(Integer filial) {
		this.filial = filial;
	}

	public String getCnpjFormatted() {
		return this.format();
	}

	public String getAsString() {
		return this.format();
	}

	public void setAsString(String numero) {
		String cnpjStr = numero.replaceAll("\\.", "").replaceAll("\\-", "").replaceAll("\\/", "");
		
		cnpjStr = StringUtils.leftPad(cnpjStr.trim(), 14, "0");
		String raizStr = StringUtils.left(cnpjStr, 8);
		String numStr = StringUtils.mid(cnpjStr, 8, 4);
		String dvStr = StringUtils.right(cnpjStr, 2);

		this.raiz = Integer.parseInt(raizStr);
		this.filial = Integer.parseInt(numStr);
		this.dv = Integer.parseInt(dvStr);
	}

	public Integer getDv() {
		if (dv == null && raiz != null && filial != null) {
			String myBase = StringUtils.leftPad(raiz.toString().trim(), 8, "0");
			String myFilial = StringUtils.leftPad(filial.toString().trim(), 4, "0");
			String myCnpj = myBase + myFilial;
			this.dv = CpfCnpjUtil.calcularDigito(myCnpj, CpfCnpjUtil.pesoCNPJ);
		}
		return dv;
	}

	public void setDv(Integer dv) {
		this.dv = dv;
	}

	public String getDvAsString() {
		if (dv == null) {
			return null;
		} else {
			String myDV = StringUtils.leftPad(dv.toString().trim(), 2, "0");
			return myDV;
		}
	}

	public String toString() {
		if (dv != null && raiz != null && filial != null) {
			String myBase = StringUtils.leftPad(raiz.toString().trim(), 8, "0");
			String myFilial = StringUtils.leftPad(filial.toString().trim(), 4, "0");
			String myDv = StringUtils.leftPad(dv.toString().trim(), 2, "0");
			String myCnpj = myBase + myFilial + myDv;
			return myCnpj;
		} else {
			return null;
		}
	}

	public String format() {
		if (dv == null || raiz == null || filial == null) {
			return null;
		}

		try {
			MaskFormatter mf;
			String cnpj = this.toString();
			// System.out.println("cep.format.myCep="+myCep);
			cnpj = StringUtils.leftPad(cnpj, 14, "0");
			// System.out.println("cep.format.myCep="+myCep);
			mf = new MaskFormatter("##.###.###/####-###");
			mf.setValueContainsLiteralCharacters(false);
			// System.out.println("cep.format.mf.valueToString(myCep)="+mf.valueToString(myCep));
			return mf.valueToString(cnpj);
		} catch (ParseException e) {
			return null;
		}
	}

	public String formatProtected() {
		if (dv == null || raiz == null || filial == null) {
			return null;
		}

		try {
			MaskFormatter mf;
			String cnpj = this.toString();
			// System.out.println("cep.format.myCep="+myCep);
			cnpj = StringUtils.leftPad(cnpj, 14, "0");
			// System.out.println("cep.format.myCep="+myCep);
			mf = new MaskFormatter("##.###.###/####-###");
			mf.setValueContainsLiteralCharacters(false);
			// System.out.println("cep.format.mf.valueToString(myCep)="+mf.valueToString(myCep));

			StringBuffer cnpjString = new StringBuffer(mf.valueToString(cnpj));
			cnpjString.replace(3, 6, "***");
			return cnpjString.toString();
		} catch (ParseException e) {
			return null;
		}
	}

	public Long toLong() {
		if (dv != null && raiz != null && filial != null) {
			Long myCnpj = Long.parseLong(this.toString());
			return myCnpj;
		} else {
			return null;
		}
	}

	public static Boolean valid(String cnpj)
			throws CnpjLengthException, CnpjOutOfRangeException, CnpjNotNumericException {
		try {
			/*
			 * Cnpj nao preenchido � considerado v�lido. A l�gica para considerar
			 * obrigat�rio deve ser da aplica��o
			 */
			if (cnpj == null)
				return true;

			/*
			 * retira formata��o
			 */
			cnpj = cnpj.replaceAll("\\.", "").replaceAll("\\-", "").replaceAll("\\/", "");
			cnpj = cnpj.trim();
			/*
			 * verifica cpfs fora da faixa de tamanho
			 */
			if (cnpj.length() < 7 || cnpj.length() > 14)
				throw new CnpjLengthException();

			/*
			 * Converte em long
			 */
			Long cpfLong = Long.parseLong(cnpj);
			/*
			 * verifica cpfs fora da faixa de valor
			 */

			if (cpfLong < Cnpj.CNPJ_MIN_VALUE || cpfLong > Cnpj.CNPJ_MAX_VALUE)
				throw new CnpjOutOfRangeException();

			return true;
		} catch (NumberFormatException e) {
			throw new CnpjNotNumericException();
		}
	}

	public Boolean isValid() throws CpfCnpjNotNumericException, CpfCnpjLengthException {
		return CpfCnpjUtil.isValidCPF(this.toString());
	}

}
