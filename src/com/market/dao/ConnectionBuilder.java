package com.market.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBuilder {
	
	private static ConnectionBuilder instancia;
	private Connection con;
	private static final String DB_URL = "jdbc:mysql://localhost:3306/mercado?useTimezone=true&serverTimezone=UTC";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "";
	
	private ConnectionBuilder() {
	}
	
	public static ConnectionBuilder getInstance() {
		if (instancia == null) { 
			instancia = new ConnectionBuilder();
		}
		return instancia;
	}

	public Connection getConnection() {
		try {
			if (con == null || con.isClosed()) { 
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
}
