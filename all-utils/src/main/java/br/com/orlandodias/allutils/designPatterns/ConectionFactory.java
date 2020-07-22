package br.com.orlandodias.allutils.designPatterns;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import br.com.orlandodias.allutils.exception.InfrastructureException;
import br.com.orlandodias.allutils.library.Show;

public class ConectionFactory {
	private static DataSource pool = null;
	private static String poolFileResourceName = "pool";

	public static Connection getConnection(String databaseConnectionName) {
		try {
			ResourceBundle prop = ResourceBundle.getBundle(poolFileResourceName);
			// getBundle() propaga MissingResourceException

			String nomePool = prop.getString(databaseConnectionName);
			// getString() propaga MissingResourceException

			InitialContext ic = new InitialContext();
			// System.out.println(ic.getClass().getName());
			// retorna javax.naming.InitialContext

			Context ambiente = (Context) ic.lookup("java:comp/env");
			// System.out.println(ambiente.getClass().getName());
			// retorna org.apache.naming.NamingContext

			pool = (DataSource) ambiente.lookup(nomePool);

			// A classe DataSouce faz parte de uma extens�o padr�o da linguagem
			// Java.
			// Encontra-se no package javax.sql. Trata-se de uma classe da API
			// JDBC 2.0
		} catch (NamingException e) {
			Show.out(e.getLocalizedMessage(),"$");
			throw new InfrastructureException(e);
		} catch (MissingResourceException e) {
			Show.out(e.getLocalizedMessage(),"_");
			throw new InfrastructureException(e);
		} catch (Exception e) {
			Show.out(e.getLocalizedMessage(),"+");
			throw new InfrastructureException(e);
		}

		try {
			Connection conn = pool.getConnection();
			conn.setAutoCommit(false);
			return conn;
		} catch (SQLException e) {
			Show.out(e.getLocalizedMessage(),"-");
			System.out.println("Ocorreu um erro ao abrir a conex�o com o Banco de Dados");
			System.out.println(e.getMessage());
			throw new InfrastructureException(e);
		}
	}
}
