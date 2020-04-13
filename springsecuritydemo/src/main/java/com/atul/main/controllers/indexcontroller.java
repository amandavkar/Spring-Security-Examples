package com.atul.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexcontroller {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logoutPage() {
		return "logout";
	}
	
	@RequestMapping("/logout-success")
	public String logoutSuccessPage() {
		return "logout";
	}

}
