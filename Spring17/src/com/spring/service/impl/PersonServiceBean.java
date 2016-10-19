package com.spring.service.impl;

import com.spring.service.PersonService;

public class PersonServiceBean implements PersonService {

	public String findName(int id) {
		
		return "Diana";
	}
	
	public void save(String name) {
		
		System.out.println("PersonServiceBean save");
	}
	
	public void update(String name) {
		
		throw new RuntimeException("“Ï≥£");
	}
}
