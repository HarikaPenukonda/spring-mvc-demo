package com.udemy.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// add an initbinder to convert trim input strings
	// remove leading and trailing whitespace
	// resolve issue for our validation
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) { //initBinder --> will preprocess each web request to our controller
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true); // stringTrimmerEditor --> defined in class SpringAPI,removes leading and trailing whitespace, true --> true
		dataBinder.registerCustomEditor(String.class,stringTrimmerEditor); // For every String class apply stringTrimmerEditor
	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, // @Valid tells Spring to validate customer object
							BindingResult theBindingResult) { // Spring will store results of validation in BindingResult object
		
		System.out.println("Last name: | " +theCustomer.getLastName() + " | ");
		System.out.println("Binding Result: " + theBindingResult);
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}
		else {
			return "customer-confirmation";
		}
		
	}

}
