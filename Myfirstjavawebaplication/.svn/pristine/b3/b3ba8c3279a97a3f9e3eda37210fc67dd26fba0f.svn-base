package com.bootcamp.java.firstassingnmentcontroller.lei;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class MyFirstJavaProject extends HttpServlet {

	String DB_CONNECTION_URL = "jdbc:mysql://localhost:3306/project1";
	String DB_USERNAME = "root";
	String DB_PASSWORD = "123456";

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DB_CONNECTION_URL, DB_USERNAME, DB_PASSWORD);

			PreparedStatement ps = con
					.prepareStatement("insert into new_table(FirstName,LastName,EmailAddress) values(?,?,?)");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, email);

			int result = ps.executeUpdate();

			if (result == 1) {
				response.sendRedirect("success.html");
			} else {
				response.sendRedirect("error.html");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}