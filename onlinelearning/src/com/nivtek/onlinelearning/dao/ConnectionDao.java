/**
 * 
 */
package com.nivtek.onlinelearning.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author AsimSubedi
 *
 */
public class ConnectionDao {
	private static String DB_URL = "jdbc:mysql://localhost:3306/maheshdb";
	private static String DB_USER = "root";
	private static String DB_PASS = "123456";

	public Connection getConnection() {
		Connection connection = null;

		// 1. Loading Driver Class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. Getting a connection to the Database
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

		} catch (Exception e) {
			e.printStackTrace();

		}
		
		return connection;

	}

}
