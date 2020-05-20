package com.nivtek.securityapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String name(){
		
		return "home.jsp";
	}
	
	
	//for customized login page
	@RequestMapping("/login")
	public String loginPage() {
		
		
		return "login.jsp";
	}
	
	//for customized logout page
	@RequestMapping("/logout-sucess")
	public String logioutPage() {
		
		
		return "logout.jsp";
	}

}
