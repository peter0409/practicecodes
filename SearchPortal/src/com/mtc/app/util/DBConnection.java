package com.mtc.app.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {
	
	private static Connection connection = null;
	
	public static Connection getConnection() throws FileNotFoundException, IOException {
		
		Properties props = new Properties();
		
		props.load(new FileInputStream("C:\\BootCampJan2020\\Development\\Workspace\\Practice Workspace\\SearchPortal\\loginInfo.properties"));
		
		final String DB_URL = props.getProperty("dburl");

		final String DB_USER = props.getProperty("user");

		final String DB_PASS = props.getProperty("password");

		final String DRIVER = props.getProperty("driver");

		// check the connection


			try {

				//load the driver
				Class.forName(DRIVER);

				// Get the connection
				connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

			} catch (Exception e) {

				e.printStackTrace();
			}

			return connection;

		}
	}


