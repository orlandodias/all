package br.com.orlandodias.allutils.library;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import br.com.orlandodias.allutils.designPatterns.ConectionFactory;
import br.com.orlandodias.allutils.exception.InfrastructureException;
import br.com.orlandodias.allutils.model.DebugTransaction;

public class JDBCUtil {
	// Ao ser executado o m�todo beginTransaction() uma nova conex�o de banco de
	// dados � criada.
	// Ao ser comitada uma transa��o a conex�o de banco de dados � fechada em
	// seguida.
	// Logo ap�s uma conex�o sofrer rollback, a conex�o de banco de dados �
	// fechada.

	private static final ThreadLocal<Connection> threadConnection = new ThreadLocal<Connection>();

	public static void beginTransaction(String databaseConnectionName) {
		Connection conn = threadConnection.get();
		if (conn == null) {
			conn = ConectionFactory.getConnection(databaseConnectionName);
			threadConnection.set(conn);
		} else {
			System.out.println(">=>=>=>=>=>=>=>=>=>=>=>= Encontrada transação aberta");
			rollbackTransaction();
			throw new InfrastructureException("Tentando iniciar transacao com transacao ativa.");
		}
	}

	public static void commitTransaction() {
		Connection conn = threadConnection.get();
		try {
			conn.commit();
			conn.close(); // retorna a Conex�o para o pool de conex�es
			threadConnection.set(null);
		} catch (SQLException e) {
			DebugTransaction.show("JDBCUTIL", "commitTransaction", "commit",null);
			System.out.println(e.getMessage());
			throw new InfrastructureException(e);
		}
	}

	public static void rollbackTransaction() {
		Connection conn = threadConnection.get();
		if (conn != null) {
			Boolean closed = false;
			Integer i = 0;
			while (i < 10 || closed == true) {
				i++;
				try {
					conn.rollback();
					conn.close(); // retorna a Conex�o para o pool de conex�es
					threadConnection.set(null);
					closed = true;
				} catch (SQLException e) {
					if (i >= 9)
						throw new InfrastructureException(e);
				}
			}
		}
	}

	public static Connection getConnection() {
		return threadConnection.get();
	}

	public static void setBoolean(PreparedStatement ps, Integer pos, Boolean value) throws SQLException {
		if (value == null)
			ps.setNull(pos, java.sql.Types.BOOLEAN);
		else
			ps.setBoolean(pos, value);
	}

	public static final java.sql.Date setSqlDate(Date d) {
		java.sql.Date sqlDate = new java.sql.Date(d.getTime());
		return sqlDate;
	}

	public static final Timestamp setSqlDateTime(Date d) {
		Timestamp sqlDateTime = new Timestamp(d.getTime());
		return sqlDateTime;
	}

	public static void setCalendar(PreparedStatement ps, Integer pos, Calendar value) throws SQLException {
		if (value == null)
			ps.setNull(pos, java.sql.Types.DATE);
		else
			ps.setTimestamp(pos, setSqlDateTime(value.getTime()));
	}

	public static void setCalendar(CallableStatement cs, Integer pos, Calendar value) throws SQLException {
		if (value == null)
			cs.setNull(pos, java.sql.Types.DATE);
		else
			cs.setTimestamp(pos, setSqlDateTime(value.getTime()));
	}

	public static void setDate(PreparedStatement ps, Integer pos, Date value) throws SQLException {
		if (value == null)
			ps.setNull(pos, java.sql.Types.DATE);
		else
			ps.setDate(pos, setSqlDate(value));
	}

	public static void setDate(CallableStatement cs, Integer pos, Date value) throws SQLException {
		if (value == null)
			cs.setNull(pos, java.sql.Types.DATE);
		else
			cs.setDate(pos, setSqlDate(value));
	}

	public static void setFloat(PreparedStatement ps, Integer pos, Float value) throws SQLException {
		if (value == null)
			ps.setNull(pos, java.sql.Types.FLOAT);
		else
			ps.setFloat(pos, value);
	}

	public static void setFloat(CallableStatement cs, Integer pos, Float value) throws SQLException {
		if (value == null)
			cs.setNull(pos, java.sql.Types.FLOAT);
		else
			cs.setFloat(pos, value);
	}

	public static void setInt(PreparedStatement ps, Integer pos, Integer value) throws SQLException {
		if (value == null)
			ps.setNull(pos, java.sql.Types.INTEGER);
		else
			ps.setInt(pos, value);
	}

	public static void setInt(CallableStatement cs, Integer pos, Integer value) throws SQLException {
		if (value == null)
			cs.setNull(pos, java.sql.Types.INTEGER);
		else
			cs.setInt(pos, value);
	}

	public static void setLong(PreparedStatement ps, Integer pos, Long value) throws SQLException {
		if (value == null)
			ps.setNull(pos, java.sql.Types.BIGINT);
		else
			ps.setLong(pos, value);
	}

	public static void setLong(CallableStatement cs, Integer pos, Long value) throws SQLException {
		if (value == null)
			cs.setNull(pos, java.sql.Types.BIGINT);
		else
			cs.setLong(pos, value);
	}

	public static void setString(PreparedStatement ps, Integer pos, String value) throws SQLException {
		if (value == null || value == "")
			ps.setNull(pos, java.sql.Types.LONGVARCHAR);
		else
			ps.setString(pos, value);
	}

	public static void setString(CallableStatement cs, Integer pos, String value) throws SQLException {
		if (value == null || value == "")
			cs.setNull(pos, java.sql.Types.LONGVARCHAR);
		else
			cs.setString(pos, value);
	}

	public static Calendar getTimestampAsCalendar(ResultSet rs, Timestamp value) throws SQLException {
		if (value == null) {
			return null;
		} else {
			Calendar calendar = Calendar.getInstance();
			calendar.setTimeInMillis(value.getTime());
			return calendar;
		}
	}

}