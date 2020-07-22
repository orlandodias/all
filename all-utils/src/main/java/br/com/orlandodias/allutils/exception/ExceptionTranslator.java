package br.com.orlandodias.allutils.exception;

import java.sql.SQLException;

public class ExceptionTranslator {
	public static DataAccessException translateSQLException(SQLException e) {
		if ("23".equals(e.getSQLState())) {
			return new ConstraintViolationException(e);
		} else {
			return new UnknownDataAccessException(e);
		}
	}
}
