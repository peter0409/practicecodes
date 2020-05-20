package com.nivtek.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;





@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	
	
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		
		
//		javax.servlet.http.Cookie[] cookies =request.getCookies();
	Cookie[] cookies =request.getCookies();
		int k=0;

		for(javax.servlet.http.Cookie c :cookies) {
			
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
			
		}
		
		
		
		//servlet  another way to send object from one serlvet to another
//		HttpSession session = request.getSession();
//
//		
////		session.removeAttribute("k");
//		
//		
//		int k =(int)session.getAttribute("k");
//		
//		
//		int k = Integer.parseInt(request.getParameter("k"));
	
	k =k*k;
	
	PrintWriter out = response.getWriter();
	out.println("result is" + k);
		
		
//		int k = (int) request.getAttribute("k");
//		
//		k =k*k;
//		
//		PrintWriter out = response.getWriter();
//
//		out.println("result is" + k);
		
		System.out.println("sq called");
		
	}
	
}