package br.com.orlandodias.allutils.model;

public class JDBCGenericDAO {
	private static String schemaName;
	private static String tableName;
	
	public void initialize(String schemaNameI, String tableNameI) {
		schemaName = schemaNameI;
		tableName = tableNameI;
	}

	public static String getSchemaName() {
		return schemaName;
	}

	public static void setSchemaName(String schemaName) {
		JDBCGenericDAO.schemaName = schemaName;
	}

	public static String getTableName() {
		return tableName;
	}

	public static void setTableName(String tableName) {
		JDBCGenericDAO.tableName = tableName;
	}
	
	public static String getFullName() {
		StringBuffer myFullName = new StringBuffer();
		if (schemaName != null) {
			myFullName.append(schemaName);
			myFullName.append(".");
		}
		myFullName.append(tableName);
		return myFullName.toString();
	}

}
