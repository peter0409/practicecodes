/**
 * 
 */
package com.nivtek.productportal.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nivtek.productportal.entity.Product;
import com.nivtek.productportal.service.ProductService;

/**
 * @author AsimSubedi
 *
 */
@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	/**
	 * 
	 * This method is responsible for Searching the product for given product id!!
	 * 
	 * @param request
	 * @param model
	 * @return ModelAndView with searched product and product display view name
	 */
	@RequestMapping(value = "searchproduct", method = RequestMethod.GET)
	public ModelAndView searchProduct(HttpServletRequest request, Model model) {

		int pid = Integer.parseInt(request.getParameter("id"));

		Product product = productService.findById(pid);
		model.addAttribute("product", product);

		return new ModelAndView("product-display");
	}

	/**
	 * This method is responsible to display the add product form
	 * 
	 * @param modelMap
	 * @return addProduct form view page
	 */
	@RequestMapping(value = "/addproduct", method = RequestMethod.GET)
	public String showView(ModelMap modelMap) {

		// registering command object - to populate the form data to the product
		modelMap.addAttribute("product", new Product());

		// JSP file Name is add-product which has form to add the product to the
		// database
		return "add-product";

	}

	/**
	 * @param product
	 * @param model
	 * @return Product Add Success Page
	 */
	@RequestMapping(value = "/addproduct", method = RequestMethod.POST)
	public String processRequest(Product product, Model model) {

		System.out.println("processRequest()  ----- ");

		System.out.println(product);

		int isSaved = productService.saveProduct(product);

		if (isSaved == 1) {
			System.out.println("Yea Successfully Saved!!!!");
			model.addAttribute("message", "The Product is SuccessFully Saved!!!");
		}

		return "success";

	}

}
