package com.crud.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public static Connection createConnectionSQLServer() throws Exception {
		// FAZ COM QUE A CLASSE SEJA CARREGADA PELA JVM
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection connection = DriverManager.getConnection(
				"jdbc:sqlserver://DESKTOP-GODBMFL;"
				+ "databaseName=CrudRecodeMoodle;"
				+ "user=sa;"
				+ "password=W471984wN250299n");
		return connection;
	}
	public static void main(String[] args) throws Exception {

		Connection conn = createConnectionSQLServer();
		
		// TESTA A CONNEXÃO
		if (conn != null) {
			System.out.println("Conexão estabelecida com DB SQL Server " + conn);
		}
		
	}

}
