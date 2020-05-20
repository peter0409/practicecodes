package com.nivtek.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/add")


public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i + j;
		
		//set cookie
//		
	Cookie cookie = new Cookie("Key", String.valueOf(k));
	
response.addCookie(cookie);

	response.sendRedirect("sq");
//		
//		 HttpSession session =request.getSession();
//		 session.setAttribute("k", k);
//		 
		 
		 
		//addservlet send response to client and tell client to go to sqservelet.
		//to avoid to put ?k=3 we put ?k+k here
//		response.sendRedirect("sq?k"+k);
		
		
		
//		k =k*k;
		
		//first k is key , the second one is value
//	request.setAttribute("k", k);
//		
//		RequestDispatcher rd = request.getRequestDispatcher("sq");
//		rd.forward(request, response);

//		PrintWriter out = response.getWriter();
//
//		out.println("result is" + k);
	}

}
