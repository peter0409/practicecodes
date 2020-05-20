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

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/deleteproduct")
public class DeleteProduct extends HttpServlet {
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
		
		int isDeleted = productDao.delete(Integer.parseInt(request.getParameter("id")));
		
		System.out.println(isDeleted);
		
		if(isDeleted == 1) {
			request.setAttribute("success", "Your Data is Deleted!!");
		} else {
			request.setAttribute("error", "Your Data is Not Deleted!!");
			
		}

		request.getRequestDispatcher("success.jsp").forward(request, response);

	}

}
