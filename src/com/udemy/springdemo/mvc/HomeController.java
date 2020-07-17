package com.udemy.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // tells spring that this is an mvc controller
public class HomeController {
	
	
	@RequestMapping("/") /* to map the url to the actual method, 
							manages all types of http requests for getting posts*/ 
	public String showPage()
	{
		return "main-menu";
	}
	
}