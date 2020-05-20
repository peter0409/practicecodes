package com.nivtek.onlinelearning.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nivtek.onlinelearning.dao.IProductDao;
import com.nivtek.onlinelearning.dao.ProductDao;
import com.nivtek.onlinelearning.entity.Product;
import com.nivtek.onlinelearning.service.IProductService;
import com.nivtek.onlinelearning.service.ProductService;

/**
 * Servlet implementation class ProductSearchServlet
 */
@WebServlet("/productsearch")
public class ProductSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// servlet needs dao so,
	private IProductDao productDao;
	
	private IProductService productService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		productDao = new ProductDao();
		productService = new ProductService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// read the parameter passed from search form using request object
		int productId = Integer.parseInt(request.getParameter("productid"));

		// lets call findById method of productDAO
		Product product = productDao.findById(productId);
		
		// lets use jsp to render the task of displaying to jsp page
		request.setAttribute("searchedProduct", product);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("productview.jsp");
		requestDispatcher.forward(request, response);

		// get PrintWriter Object to construct a page dynamically and send it as a
		// response back to the client
		// this is PRESENTATION LOGIC!!! that renders the response to client
		
		/*
		 * PrintWriter out = response.getWriter();
		 * 
		 * out.println("<html><head><title>Search Page</title></head><body>");
		 * out.println("<h2 align='center'> Product Record</h2>");
		 * out.println("<div align='center'><table border='2'>"); out.
		 * println("<tr> <th>ProductId</th> <th>Name</th> <th>Price</th> <th>Description</th> </tr>"
		 * ); out.println("<tr>"); out.println("<td>" + product.getId() + "</td>");
		 * out.println("<td>" + product.getName() + "</td>"); out.println("<td>" +
		 * product.getPrice() + "</td>"); out.println("<td>" + product.getDescription()
		 * + "</td>"); out.println("</tr></table></body></html>");
		 */

	}

}
