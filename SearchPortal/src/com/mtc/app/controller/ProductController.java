package com.mtc.app.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


import com.mtc.app.dao.ProductDAO;
import com.mtc.app.dao.ProductDAOImpl;
import com.mtc.app.entity.Product;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/products")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ProductDAO productDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        
    }
    
    @Override
    public void init() throws ServletException {
    	productDAO = new ProductDAOImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getAllProducts(request, response);
		
		String action = request.getParameter("action");
		
		if(action == null) {
			
			action = "LIST";
		}
		
		switch(action) {
		
		case "LIST":
			
			getAllProducts(request, response);
			
			break;
		
		
		case "EDIT":
			
			findProductById(request,response);
		
		default:
			
			getAllProducts(request, response);
			
			break;
			
	}
			
		
	}
	
	public void getAllProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		
		try {
			
			List<Product> products = productDAO.findAll();
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("allproducts.jsp");
			
			request.setAttribute("products", products);
			
			dispatcher.forward(request, response);
			
		} catch (SQLException | IOException e) {
			
			
			e.printStackTrace();
			
		}
	}
	
	public void findProductById(HttpServletRequest request, HttpServletResponse response) {
		
		String productName = request.getParameter("productname");
		
		double price = Double.parseDouble(request.getParameter("price"));
		
		String description = request.getParameter("description");
		
		Product product = new Product();
		
		product.setName(productName);
		product.setPrice(price);
		product.setDescription(description);
		
		
		try {
			
			productDAO.update(product);
		} catch (Exception e) {
			
		}

}
	}
