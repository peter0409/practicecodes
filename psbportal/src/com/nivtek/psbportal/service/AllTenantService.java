package com.nivtek.psbportal.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nivtek.psbportal.entities.Tenant;
import com.nivtek.psbportal.dao.PropertyDAO;

/**
 * Servlet implementation class AllTenantService
 */
@WebServlet("/AllTenantService")
public class AllTenantService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllTenantService() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// set the response content type to html
		response.setContentType("text/html");

		// create printwriter object
		PrintWriter out = response.getWriter();
		
		PropertyDAO property = new PropertyDAO();

		Map<String, List<Tenant>> map = property.getAllTenantsGroupByProperty();

		

		out.print(
				"<html><head><meta name ='viewport'content ='width=device-width, initial-scale =1.0'><title>PSBPORTAL | TENANTS LIST</title>"
						+ "<link rel='stylesheet' href='css/style.css' type = 'text/css'></head>");
		out.print(
				"<body style = 'background-color:black;'><div class = 'wrapper'><header class = 'header'><div class = 'logo'><h3><img src = 'images/logo.png'/></h3>"
						+ "</div><nav id ='nav'><a href = 'index.html'>Home</a><a href = 'tenant.html'>Tenant</a><a href = 'BusinessService'>"
						+ "Contact Us</a></nav><br/><hr><br/><br/><br/>");
		
		out.print("<table><tr><th>PROPERTY NAME </th><th>TENANT NAME </th></tr>");
		// loop through tenant map
		for(Map.Entry<String, List<Tenant>> allTenants: map.entrySet()) {
			
			for(int i = 0; i<(allTenants.getValue().size()); i++) {
				
			out.print("<tr>");				
			out.print("<td>" + allTenants.getKey()+"</td>");
			out.print("<td>" + allTenants.getValue().get(i).getName()+"</td");
			out.print("</tr>");
			
			}
	
		}

	

		out.print("</table></div></body></html>");



	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}


}
