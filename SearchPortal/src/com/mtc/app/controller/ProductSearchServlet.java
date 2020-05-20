package com.mtc.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mtc.app.dao.ProductDAO;
import com.mtc.app.dao.ProductDAOImpl;
import com.mtc.app.entity.Product;

/**
 * Servlet implementation class ProductSearchServlet
 */
@WebServlet("/productsearch")
public class ProductSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ProductDAO productDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductSearchServlet() {
        super();
       
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	
    	productDAO = new ProductDAOImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pid = Integer.parseInt(request.getParameter("productid"));
		try {
			Product product = productDAO.findById(pid);
			
			request.setAttribute("product", product);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("productview.jsp");
			
			dispatcher.forward(request, response);
		
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
