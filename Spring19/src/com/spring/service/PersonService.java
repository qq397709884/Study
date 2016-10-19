package com.spring.service;

public interface PersonService {
	
	public String findName(int id);
	
	public void save(String name);
	
	public void update(String name);
}

