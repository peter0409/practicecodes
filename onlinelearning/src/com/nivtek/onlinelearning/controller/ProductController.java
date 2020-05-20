package com.nivtek.onlinelearning.controller;

import java.io.IOException;
import java.util.List;

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

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/products")
public class ProductController extends HttpServlet {
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Product> products = productDao.findAll();

		request.setAttribute("products", products);

		// create dispatcher object to call the JSP

		request.getRequestDispatcher("allproducts.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Product product = new Product();
		
		product.setId(Integer.parseInt(request.getParameter("productid")));
		product.setName(request.getParameter("productName"));
		product.setPrice(Float.parseFloat(request.getParameter("productPrice")));
		product.setDescription(request.getParameter("productDescription"));
		product.setQuantity(Integer.parseInt(request.getParameter("productQuantity")));
		
		System.out.println(product);
		
		int saved = productDao.add(product);
		
		if(saved == 1) {
			request.setAttribute("success", "Your Data is Saved!!");
		} else {
			request.setAttribute("error", "Your Data is Not Saved!!");
		}
		
		request.getRequestDispatcher("success.jsp").forward(request, response);
		
		
		
	}
	
	

}
