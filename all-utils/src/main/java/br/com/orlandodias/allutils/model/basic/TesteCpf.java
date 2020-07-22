package br.com.orlandodias.allutils.model.basic;

import br.com.orlandodias.allutils.exception.CpfCnpjLengthException;
import br.com.orlandodias.allutils.exception.CpfCnpjNotNumericException;
import br.com.orlandodias.allutils.exception.CpfFicticioInvalidException;
import br.com.orlandodias.allutils.library.Show;

public class TesteCpf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer count = 0;
		for (Integer i = 0; i < 10000000; i++) {
			//System.out.println(i.toString() + ": " + fic.format());
			try {
				@SuppressWarnings("unused")
				CpfFicticio fic = new CpfFicticio(i);
			} catch (CpfCnpjNotNumericException e) {
				Show.out("CpfCnpjNotNumericException:" + i);
			} catch (CpfCnpjLengthException e) {
				Show.out("CpfCnpjLengthException:" + i);
			} catch (CpfFicticioInvalidException e) {
				// TODO Auto-generated catch block
				Show.out("CpfCnpjLengthException:" + i);
				count++;
			}
		}
		Show.out("V�lidos:" + count.toString());
	}

}
