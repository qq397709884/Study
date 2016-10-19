package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.PersonDao;
import com.spring.service.PersonService;

public class PersonServiceBean2 implements PersonService {

	private PersonDao personDao;
	
	@Autowired
	public void setPersonDao(PersonDao personDao) {
	
		this.personDao = personDao;
	}
	
	public PersonServiceBean2() {}

	public PersonServiceBean2(PersonDao personDao) {
		
		this.personDao = personDao;
	}

	public void save(){
		
		personDao.add();
	}
}
