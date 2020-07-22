package br.com.orlandodias.allutils.library;

import java.util.Random;

public class UtilRandom {

	public static Long randomLong() {
		long LOWER_RANGE = 100000000; // assign lower range value
		long UPPER_RANGE = 999999999; // assign upper range value

		return randomLong(LOWER_RANGE, UPPER_RANGE);
	}

	public static Long randomLong(Long lowerRange, Long upperRange) {
		Random random = new Random();

		long randomValue = lowerRange + (long) (random.nextDouble() * (upperRange - lowerRange));
		return randomValue;
	}

	public static Long ramdomLongWithDV() {
		Long idTkn = UtilRandom.randomLong();
		Integer dv = DVUtil.getMod11(idTkn.toString().trim());

		String myNewToken = idTkn.toString().trim() + dv.toString().trim();

		idTkn = Long.parseLong(myNewToken);

		return idTkn;
	}

}