package br.com.orlandodias.allutils.model;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import br.com.orlandodias.allutils.exception.InfrastructureException;

public class TableName {
	private static ResourceBundle prop;

	static {
		try {
			prop = ResourceBundle.getBundle("table");
		} catch (MissingResourceException e) {
			System.out.println("Aquivo table.properties n�o encontrado.");
			throw new InfrastructureException(e);
		}
	}

	public static String getTableName(String name) {
		String tableName;

		try {
			tableName = prop.getString(name);
		} catch (MissingResourceException e) {
			System.out.println("Chave " + name
					+ " n�o encontrada em table.properties");
			throw new InfrastructureException(e);
		}

		return tableName;
	}

	public static String getTableNameAS(String name) {
		StringBuffer tableName = new StringBuffer(getTableName(name));
		tableName.append(" ");
		tableName.append(name.toUpperCase());

		return tableName.toString();
	}
}
