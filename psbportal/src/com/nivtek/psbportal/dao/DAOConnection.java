package com.nivtek.psbportal.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DAOConnection {
	
	
	/**
	 * @return Connection to mysql database
	 * @throws IOException 
	 */
	public static Connection getConnection() throws IOException{

		Connection connection = null;
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\BootCampNov2019\\Development\\Test\\psbportal\\psb.properties");
		prop.load(fis);
		
		try {
			// Load jdbc

			Class.forName(prop.getProperty("jdbc.driver"));

			String URL = prop.getProperty("jdbc.url");
			String username = prop.getProperty("jdbc.username");
			String password = prop.getProperty("jdbc.password");
			connection = DriverManager.getConnection(URL, username, password);

		} catch (Exception e) {

			e.printStackTrace();
		}
		fis.close();
		return connection;
	}

}
