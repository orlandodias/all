package br.com.orlandodias.allutils.model.basic;

import java.io.Serializable;
import java.text.ParseException;

import javax.swing.text.MaskFormatter;

import org.apache.commons.lang3.StringUtils;

import br.com.orlandodias.allutils.exception.CpfCnpjLengthException;
import br.com.orlandodias.allutils.exception.CpfCnpjNotNumericException;
import br.com.orlandodias.allutils.exception.CpfLengthException;
import br.com.orlandodias.allutils.exception.CpfNotNumericException;
import br.com.orlandodias.allutils.exception.CpfOutOfRangeException;
import br.com.orlandodias.allutils.library.CpfCnpjUtil;

public class Cpf  implements Serializable {
	private static final long serialVersionUID = 187221186168732194L;
	private Integer numero;
	private Integer dv;

	public static Integer CPF_MIN_VALUE = 100;
	public static Long CPF_MAX_VALUE = 99999999999L;

	public Cpf(Integer numero, Integer dv) {
		super();
		this.numero = numero;
		this.dv = dv;
	}

	public Cpf(String numero, String dv) {
		super();
		this.numero = Integer.parseInt(numero);
		this.dv = Integer.parseInt(dv);
	}

	public Cpf(String numero) {
		super();
		numero = numero.replaceAll("\\.", "").replaceAll("\\-", "");
		String numStr = StringUtils.left(numero, 9);
		String dvStr = StringUtils.right(numero, 2);

		this.numero = Integer.parseInt(numStr);
		this.dv = Integer.parseInt(dvStr);
	}

	public Cpf(Long numero) {
		super();
		// 74556090730
		// 01234567890
		String cpfStr = StringUtils.leftPad(numero.toString().trim(), 11, "0");
		String numStr = StringUtils.left(cpfStr, 9);
		String dvStr = StringUtils.right(cpfStr, 2);

		this.numero = Integer.parseInt(numStr);
		this.dv = Integer.parseInt(dvStr);
	}

	public Cpf() {
		super();
	}

	
	
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getDv() {
		if (dv == null && numero != null) {
			String myNumero = StringUtils.leftPad(numero.toString().trim(), 9, "0");
			this.dv = CpfCnpjUtil.calcularDigito(myNumero, CpfCnpjUtil.pesoCPF);
		}
		return dv;
	}

	public String getDvAsString() {
		if (dv == null) {
			return null;
		} else {
			String myDV = StringUtils.leftPad(dv.toString().trim(), 2, "0");
			return myDV;
		}
	}

	public void setDv(Integer dv) {
		this.dv = dv;
	}

	public String toString() {
		if (dv != null && numero != null) {
			String myBase = StringUtils.leftPad(numero.toString().trim(), 9, "0");
			String myDv = StringUtils.leftPad(dv.toString().trim(), 2, "0");
			String myCnpj = myBase + myDv;
			return myCnpj;
		} else {
			return null;
		}
	}

	public String format() {
		if (dv == null || numero == null) {
			return null;
		}
		try {
			MaskFormatter mf;
			String cpf = this.toString();
			// System.out.println("cpf.format.myCep="+myCep);
			cpf = StringUtils.leftPad(cpf, 11, "0");
			// System.out.println("cpf.format.myCep="+myCep);
			mf = new MaskFormatter("###.###.###-##");
			mf.setValueContainsLiteralCharacters(false);
			// System.out.println("cep.format.mf.valueToString(myCep)="+mf.valueToString(myCep));
			return mf.valueToString(cpf);
		} catch (ParseException e) {
			return null;
		}
	}

	public String formatProtected() {
		if (dv == null || numero == null) {
			return null;
		}
		try {
			MaskFormatter mf;
			String cpf = this.toString();
			// System.out.println("cpf.format.myCep="+myCep);
			cpf = StringUtils.leftPad(cpf, 11, "0");
			// System.out.println("cpf.format.myCep="+myCep);
			mf = new MaskFormatter("###.###.###-##");
			mf.setValueContainsLiteralCharacters(false);
			// System.out.println("cep.format.mf.valueToString(myCep)="+mf.valueToString(myCep));
			StringBuffer cpfString = new StringBuffer(mf.valueToString(cpf));
			cpfString.replace(4, 7, "***");
			return cpfString.toString();
		} catch (ParseException e) {
			return null;
		}
	}

	public Long toLong() {
		if (dv != null && numero != null) {
			Long myCpf = Long.parseLong(this.toString());
			return myCpf;
		} else {
			return null;
		}
	}

	public Boolean isFicticio() throws CpfCnpjNotNumericException, CpfCnpjLengthException {
		if (this.dv != 99) {
			return false;
		} else {
			String strNumero = StringUtils.leftPad(this.numero.toString().trim(), 9, "0");
			if (!("9".equals(StringUtils.substring(strNumero, 0, 1)))) {
				return false;
			} else if (!("9".equals(StringUtils.substring(strNumero, 8, 1)))) {
				return false;
			} else {
				return true;
			}
		}
	}

	public static Boolean valid(String cpf) throws CpfLengthException, CpfOutOfRangeException, CpfNotNumericException {
		try {
			/*
			 * Cpf nao preenchido � considerado v�lido. A l�gica para considerar obrigat�rio
			 * deve ser da aplica��o
			 */
			if (cpf == null)
				return true;

			/*
			 * retira formata��o
			 */
			cpf = cpf.replaceAll("\\.", "").replaceAll("\\-", "").replaceAll("\\/", "");
			cpf = cpf.trim();
			
			/*
			 * verifica cpfs fora da faixa de tamanho
			 */
			if (cpf.length() < 3 || cpf.length() > 14)
				throw new CpfLengthException();

			/*
			 * Converte em long
			 */
			Long cpfLong = Long.parseLong(cpf);
			/*
			 * verifica cpfs fora da faixa de valor
			 */
			
			if (cpfLong < Cpf.CPF_MIN_VALUE || cpfLong > Cpf.CPF_MAX_VALUE)
				throw new CpfOutOfRangeException();

			return true;
		} catch (NumberFormatException e) {
			throw new CpfNotNumericException();
		}
	}

	public Boolean isValid() throws CpfCnpjNotNumericException, CpfCnpjLengthException {
		if (this.isFicticio() == true) {
			return true;
		} else {
			return CpfCnpjUtil.isValidCPF(this.toString());
		}
	}

}
