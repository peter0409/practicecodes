package com.nivtek.psbportal.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nivtek.psbportal.dao.TenantDAO;
import com.nivtek.psbportal.entities.Tenant;

/**
 * @author Oluwafemi Samuel
 *
 */

/**
 * Servlet implementation class process
 */

@WebServlet("/tenant")
public class TenantService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public TenantService() {

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// set the response content type to html
		response.setContentType("text/html");

		// create printwriter object
		PrintWriter out = response.getWriter();

		// create variables and call methods
		String propertyName = request.getParameter("property");
		List<Tenant> tenant = TenantDAO.getTenantsByPropertyName(propertyName);
		TenantSort sortTenants = new TenantSort();
		Collections.sort(tenant, sortTenants);


		// format and output result to interface

		out.print(
				"<html><head><meta name ='viewport'content ='width=device-width, initial-scale =1.0'><title>PSBPORTAL | TENANTS LIST</title>"
						+ "<link rel='stylesheet' href='css/style.css' type = 'text/css'></head>");
		out.print(
				"<body><div class = 'wrapper'><header class = 'header'><div class = 'logo'><h3><img src = 'images/logo.png'/></h3>"
						+ "</div><nav id ='nav'><a href = 'index.html'>Home</a><a href = 'tenant.html'>Tenant</a><a href = 'BusinessService'>"
						+ "Contact Us</a></nav><br/><hr><br/><br/><br/>");
		out.print("<div><table><h2 style = 'text-align:center'>TENANTS IN " + propertyName.toUpperCase()
				+ "</h2><tr><th>TenantId</th><th>Tenant Name</th><th>Suite Number</th><th>Contact Name</th>"
				+ "<th>Contact Email</th><th>Contact Phone</th></tr>");

		// loop through tenant list

		for (Tenant uniqueTenant : tenant) {
			out.print("<tr>");
			out.print("<td>" + uniqueTenant.getTenantId() + "</td>");
			out.print("<td>" + uniqueTenant.getName() + "</td>");
			out.print("<td>" + uniqueTenant.getSuiteNumber() + "</td>");
			out.print("<td>" + uniqueTenant.getContactinfo().getName() + "</td>");
			out.print("<td>" + uniqueTenant.getContactinfo().getEmail() + "</td>");
			out.print("<td>" + uniqueTenant.getContactinfo().getPhone() + "</td>");
			out.print("</tr>");
		}

		out.print("</table><br/><div style = 'text-align: center;'><p>Click <a style = 'text-decoration: none;'href = 'AllTenantService'>here</a> to view all "
				+ "tenants</p></div></div></div></body></html>");

	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}


}
