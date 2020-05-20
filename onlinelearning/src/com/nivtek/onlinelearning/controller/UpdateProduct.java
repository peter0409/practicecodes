package com.nivtek.onlinelearning.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nivtek.onlinelearning.dao.IProductDao;
import com.nivtek.onlinelearning.dao.ProductDao;
import com.nivtek.onlinelearning.entity.Product;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/editproduct")
public class UpdateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// servlet needs dao so,
	private IProductDao productDao;

	@Override
	public void init(ServletConfig config) throws ServletException {
		productDao = new ProductDao();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * 
	 * // read parameters from request int productId =
	 * Integer.parseInt(request.getParameter("id"));
	 * 
	 * Product product = productDao.findById(productId);
	 * 
	 * //int isUpdated = productDao.update(product);
	 * 
	 * //request.setAttribute("updated", isUpdated);
	 * 
	 * request.setAttribute("productUpdate", product);
	 * 
	 * // create dispatcher object to call the JSP
	 * request.getRequestDispatcher("update.jsp").forward(request, response);
	 * 
	 * //response.sendRedirect("productsearch");
	 * 
	 * }
	 */

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Product product = new Product();
		
		int productId = Integer.parseInt(request.getParameter("productId"));
		
		product.setId(productId);
		product.setName(request.getParameter("productName"));
		product.setPrice(Float.parseFloat(request.getParameter("productPrice")));
		product.setDescription(request.getParameter("productDescription"));
		product.setQuantity(Integer.parseInt(request.getParameter("productQuantity")));
		
		int saved = productDao.update(product);
		
		if(saved == 1) {
			request.setAttribute("success", "Your Data is Updated!!");
		} else {
			request.setAttribute("error", "Your Data is Not Updated!!");
		}
		
		request.getRequestDispatcher("success.jsp").forward(request, response);
		
		
	}
	
	
	

}
