package com.udemy.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private String country;
	
	private String favouriteLanguage;
	
	private LinkedHashMap<String,String> countryOptions;
	
	private LinkedHashMap<String,String> favouriteLanguageOptions;
	
	// no-arg constructor
	public Student()
	{
		// populate country options : used ISO country code
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("JP", "Japan");
		countryOptions.put("US", "United States");
		
		//populate favourite language options
		favouriteLanguageOptions = new LinkedHashMap<>();
		favouriteLanguageOptions.put("Java", "Java");
		favouriteLanguageOptions.put("Python", "Python");
		favouriteLanguageOptions.put("PHP", "PHP");
		favouriteLanguageOptions.put("Ruby", "Ruby");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
		return favouriteLanguageOptions;
	}
	
	
	
	
	
	
	
	
	

}
