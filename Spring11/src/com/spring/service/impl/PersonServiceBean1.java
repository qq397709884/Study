package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.PersonDao;
import com.spring.service.PersonService;

public class PersonServiceBean1 implements PersonService {

	@Autowired
	private PersonDao personDao;
	
	public PersonServiceBean1() {}

	public PersonServiceBean1(PersonDao personDao) {
		
		this.personDao = personDao;
	}

	public void save(){
		
		personDao.add();
	}
}
