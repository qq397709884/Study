package com.spring.service;

import java.util.List;

import com.spring.bean.Person;

public interface PersonService {
	
	public void save(Person person);
	
	public void update(Person person);
	
	public Person getPerson(Integer id);
	
	public List<Person> getPersons();

	public void delete(Integer id);
	
}
