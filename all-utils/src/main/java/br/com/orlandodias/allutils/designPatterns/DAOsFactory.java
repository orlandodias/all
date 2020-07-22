package br.com.orlandodias.allutils.designPatterns;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import br.com.orlandodias.allutils.exception.InfrastructureException;

public class DAOsFactory {
	private static ResourceBundle prop;

	static {
		try {
			prop = ResourceBundle.getBundle("dao");
		} catch (MissingResourceException e) {
			System.out.println("Aquivo dao.properties n�o encontrado.");
			throw new InfrastructureException(e);
		}
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static <T> T getDAO(Class<T> tipo) {
		T dao = null;
		String nomeDaClasse = null;

		try {
			nomeDaClasse = prop.getString(tipo.getSimpleName());
			dao = (T) Class.forName(nomeDaClasse).newInstance();
		} catch (InstantiationException e) {
			System.out.println("N�o foi poss�vel criar um objeto do tipo " + nomeDaClasse);
			throw new InfrastructureException(e);
		} catch (IllegalAccessException e) {
			System.out.println("N�o foi poss�vel criar um objeto do tipo " + nomeDaClasse);
			throw new InfrastructureException(e);
		} catch (ClassNotFoundException e) {
			System.out.println("Classe " + nomeDaClasse + " n�o encontrada");
			throw new InfrastructureException(e);
		} catch (MissingResourceException e) {
			System.out.println("Chave " + tipo + " n�o encontrada em dao.properties");
			throw new InfrastructureException(e);
		}

		return dao;
	}
}
