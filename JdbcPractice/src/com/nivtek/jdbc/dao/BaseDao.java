package com.nivtek.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
	
	
	String DB_CONNECTION_URL = "jdbc:mysql://localhost:3306/project1";
	String DB_USERNAME = "root";
	String DB_PASSWORD = "123456";
	
	public Connection getConnection() throws SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			DriverManager.getConnection(DB_CONNECTION_URL,DB_USERNAME,DB_PASSWORD);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
		
		
		
	}

}
