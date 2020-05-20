package com.nivtek.psbportal.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nivtek.psbportal.dao.BusinessDAO;
import com.nivtek.psbportal.entities.Business;

/**
 * @author Oluwafemi Samuel
 *
 */

/**
 * Servlet implementation class BusinessService
 */
@WebServlet("/BusinessService")
public class BusinessService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BusinessService() {
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//set response type to html
		response.setContentType("text/html");
		
//create printwriter object
		PrintWriter out = response.getWriter();
		
//Create List to hold business address info
		List<Business> business = BusinessDAO.getBusinessAddress();

//Use printwriter to output and format response
		out.print(
				"<html><head><meta name ='viewport'content ='width=device-width, initial-scale =1.0'><title>PSBPORTAL | CONTACT US</title>"
						+ "<link rel='stylesheet' href='css/style.css' type = 'text/css'><link rel='stylesheet'"
						+ "href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css'></head>");
		out.print(
				"<body><div class = 'wrapper'><header class = 'header'><div class = 'logo'><h3><img src = 'images/logo.png'/></h3>"
						+ "</div><nav id ='nav'><a href = 'index.html'>Home</a><a href = 'tenant.html'>Tenant</a><a href = 'BusinessService'>"
						+ "Contact Us</a></nav><br/><hr><br/><br/><br/>");
		
		out.print("<div class = 'bizAddress'>");		

//Loop to fetch data from business list object
		
		for (Business uniqueBusiness : business) {

			out.print("<h2><span class='glyphicon glyphicon-home' style ='color: gold'></span>&nbsp&nbsp" + uniqueBusiness.getBusinessName().toUpperCase() + "</h2><br/>");
			out.print("<p><span class='glyphicon glyphicon-map-marker' style ='color: yellow'></span>&nbsp" + uniqueBusiness.getBusinessAddress().getAddressLineOne() + "</p>");
			out.print("<p>&nbsp&nbsp&nbsp&nbsp&nbsp" + uniqueBusiness.getBusinessAddress().getCity() + ", ");
			out.print(uniqueBusiness.getBusinessAddress().getState() + ", ");
			out.print(uniqueBusiness.getBusinessAddress().getZipCode() + "</p>");
			out.print("<p><span class='glyphicon glyphicon-earphone' style ='color: yellow'></span>&nbsp"
					+ uniqueBusiness.getBusinessContact().getPhone() + "</p>");
			out.print("<p><span class='glyphicon glyphicon-envelope' style ='color: yellow'></span>&nbsp" + uniqueBusiness.getBusinessContact().getEmail() + "</p>");
			out.print("</div>");
		}

		out.print("</div></body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
