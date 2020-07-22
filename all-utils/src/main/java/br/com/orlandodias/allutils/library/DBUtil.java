package br.com.orlandodias.allutils.library;

public class DBUtil {

	private String schemaName;
	private String tableName;
	private String as;

	public DBUtil(String schemaName, String tableName) {
		this.schemaName = schemaName;
		this.tableName = tableName;
		this.as = tableName.toUpperCase();
	}

	public DBUtil(String schemaName, String tableName, String as) {
		this.schemaName = schemaName;
		this.tableName = tableName;
		this.tableName = as;
	}

	public String getSchemaName() {
		return schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getAs() {
		return as;
	}

	public void setAs(String as) {
		this.as = as;
	}

	public String addSchema(String objectName) {
		StringBuffer myObjectName = new StringBuffer();
		if (schemaName != null) {
			myObjectName.append(schemaName);
			myObjectName.append(".");
		}
		myObjectName.append(objectName);
		return myObjectName.toString();
	}

	public static String addSchema(String nameSchema, String objectName) {
		StringBuffer myObjectName = new StringBuffer();
		if (nameSchema != null) {
			myObjectName.append(nameSchema);
			myObjectName.append(".");
		}
		myObjectName.append(objectName);
		return myObjectName.toString();
	}

	public String getFullName() {
		StringBuffer myFullName = new StringBuffer();
		if (schemaName != null) {
			myFullName.append(schemaName);
			myFullName.append(".");
		}
		myFullName.append(tableName);
		return myFullName.toString();
	}

	public String getFullNameAs() {
		StringBuffer myFullName = new StringBuffer(this.getFullName());
		myFullName.append(" ");
		myFullName.append(tableName);
		return myFullName.toString();
	}

	@Deprecated
	public static String getTableName(String schemaName, String tableName) {
		StringBuffer myTable = new StringBuffer();
		if (schemaName != null) {
			myTable.append(schemaName);
			myTable.append(".");
		}

		myTable.append(tableName);
		myTable.append(" ");
		return myTable.toString();
	}

	@Deprecated
	public static String getTableNameAS(String schemaName, String tableName, String as) {
		StringBuffer myTable = new StringBuffer(getTableName(schemaName, tableName).trim());
		if (as != null) {
			myTable.append(" ");
			myTable.append(as);
		}

		myTable.append(" ");
		return myTable.toString();
	}

	/*
	 * ESTE M�TODO RECEBE O NOME DA TABELA J� COM O ESQUEMA (RECUPERADO DO
	 * TABLES.PROPERTIES) E O NOME DO APELIDO
	 */
	public static String getTableNameAS(String tableName, String nickName) {
		StringBuffer myTable = new StringBuffer(tableName.trim());
		if (nickName != null) {
			myTable.append(" ");
			myTable.append(nickName.toUpperCase());
		}

		myTable.append(" ");
		return myTable.toString();
	}
}
