package com.nivket.exceptionhandling.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestCheckException {
	
	public static String process() {
		try(Connection con = DriverManager.getConnection("")){
			
			return "success";
		}catch(SQLException e) {
			e.printStackTrace();
			
			
		}
		return "failed";
	}
		public static void main(String[] args) throws SQLException {
		    process();
		
		
	}
	
	
	
	
	
}

//	public static void process() throws SQLException {

//		DriverManager.getConnection("");
//
//	}
//
//	public static void main(String[] args) throws SQLException {
//		process();
//		
//		DriverManager.getConnection("");
//	}
//
//	try
//
//	{
//		Connection con = DriverManager.getConnection("");
//         //db oerations
//		// db operation
//		con.close();
//
//	}catch(
//	Exception e)
//	{
//		e.printStackTrace();
//	}
//}
//
//}
