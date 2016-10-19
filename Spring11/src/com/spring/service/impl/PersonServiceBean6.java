package com.spring.service.impl;

import javax.annotation.Resource;

import com.spring.dao.PersonDao;
import com.spring.service.PersonService;

public class PersonServiceBean6 implements PersonService {

	private PersonDao personDao;
	
	@Resource
	public void setPersonDao(PersonDao personDao) {
	
		this.personDao = personDao;
	}
	
	public PersonServiceBean6() {}

	public PersonServiceBean6(PersonDao personDao) {
		
		this.personDao = personDao;
	}

	public void save(){
		
		personDao.add();
	}
}
