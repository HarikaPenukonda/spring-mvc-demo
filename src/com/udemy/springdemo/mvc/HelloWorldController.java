package com.udemy.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") // parent mapping to avoid ambigiuous mapping of same mapping different method
public class HelloWorldController {
	
	
	// need a controller method to show the initial HTML form
	
	@RequestMapping("/showForm") // sub mappings
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	
	@RequestMapping("/processForm") //sub mappings
	public String processForm(){
		return "helloworld";
	}
	
	// new controller method to read form data
	// add data to the model
	
	@RequestMapping("/processFormVersionTwo") //sub mappings
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		// convert the data to all caps
		theName = theName.toUpperCase();
		// create a message
		String result = " Yo! " + theName;
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		// convert the data to all caps
		theName = theName.toUpperCase();
		// create a message
		String result = " Hey my friend from V3! " + theName;
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}


}