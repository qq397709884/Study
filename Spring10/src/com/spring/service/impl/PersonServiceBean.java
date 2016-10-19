package com.spring.service.impl;

import com.spring.dao.PersonDao;
import com.spring.service.PersonService;

public class PersonServiceBean implements PersonService {

	private PersonDao personDao;
	private String name;
	
	public PersonServiceBean(PersonDao personDao, String name) {
		
		this.personDao = personDao;
		this.name = name;
	}

	public void save() {
		
		System.out.println(name);
		personDao.add();
	}
}
