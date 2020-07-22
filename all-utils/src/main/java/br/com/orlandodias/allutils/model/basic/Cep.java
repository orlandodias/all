package br.com.orlandodias.allutils.model.basic;

import java.io.Serializable;
import java.text.ParseException;

import javax.swing.text.MaskFormatter;

import org.apache.commons.lang3.StringUtils;

import br.com.orlandodias.allutils.exception.CepLengthException;
import br.com.orlandodias.allutils.exception.CepNotNumericException;
import br.com.orlandodias.allutils.exception.CepOutOfRangeException;

/*
 * Brazilian ZIP Code
 * Codigo de Endere�amento Postal Brasileiro
 */
public class Cep implements Serializable {
	private static final long serialVersionUID = 1L;
	public static Integer CEP_MIN_VALUE = 1000000;
	public static Integer CEP_MAX_VALUE = 99999999;

	// @BMViewField(size=9, maxLength=9)
	private Integer cdCep;

	public Cep() {
		super();
	}

	public Cep(Integer cdCep) {
		super();
		this.cdCep = cdCep;
	}

	public Cep(String cdCepStr) {
		super();
		this.setCdCepAsString(cdCepStr);
	}

	public Integer getCdCep() {
		return cdCep;
	}

	public String getCdCepFormatted() {
		return this.format();
	}

	public String getCdCepAsString() {
		return cdCep.toString().trim();
	}

	public void setCdCep(Integer cdCep) {
		this.cdCep = cdCep;
	}

	public void setCdCepAsString(String cdCepStr) {
		this.cdCep = Integer.parseInt(cdCepStr.trim());
	}

	@Override
	public String toString() {
		return cdCep.toString().trim();
	}

	public String format() {
		//System.out.println("cep.format");
		if (this.cdCep == null || this.cdCep <= 0) {
			return null;
		}
		//System.out.println("cep.format.cdCep="+this.cdCep);
		try {
			MaskFormatter mf;
			String myCep = this.toString();
			//System.out.println("cep.format.myCep="+myCep);
			myCep = StringUtils.leftPad(myCep, 8, "0");
			//System.out.println("cep.format.myCep="+myCep);
			mf = new MaskFormatter("#####-###");
			mf.setValueContainsLiteralCharacters(false);
			//System.out.println("cep.format.mf.valueToString(myCep)="+mf.valueToString(myCep));
			return mf.valueToString(myCep);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * Valida CEP do usu�rio. N�o aceita CEP's fora da faixa 1000000 e 999999999 Ou
	 * valores alfanumericos;
	 * 
	 * @param cep
	 *            String valor do cep
	 * @throws CepNotNumericException
	 * @throws CepOutOfRangeException
	 * @throws CepLengthException
	 */
	public static Boolean valid(String cep) throws CepNotNumericException, CepOutOfRangeException, CepLengthException {
		try {
			/*
			 * Cep nao preenchido � considerado v�lido. A l�gica para considerar obrigat�rio
			 * deve ser da aplica��o
			 */
			if (cep == null)
				return true;

			/*
			 * retira formata��o
			 */
			cep = cep.replaceAll("\\.", "").replaceAll("\\-", "");

			/*
			 * Converte em inteiro
			 */
			Integer cepInt = Integer.parseInt(cep);

			/*
			 * verifica ceps fora da faixa de tamanho
			 */
			if (cep.length() < 7 || cep.length() > 8)
				throw new CepLengthException();

			/*
			 * verifica ceps fora da valor
			 */
			if (cepInt < Cep.CEP_MIN_VALUE || cepInt > Cep.CEP_MAX_VALUE)
				throw new CepOutOfRangeException();

			return true;
		} catch (NumberFormatException e) {
			throw new CepNotNumericException();
		}
	}

}
