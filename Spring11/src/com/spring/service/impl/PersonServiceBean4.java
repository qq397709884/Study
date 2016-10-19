package com.spring.service.impl;

import javax.annotation.Resource;

import com.spring.dao.PersonDao;
import com.spring.service.PersonService;

public class PersonServiceBean4 implements PersonService {

	@Resource
	private PersonDao personDao;
	
	public PersonServiceBean4() {}

	public PersonServiceBean4(PersonDao personDao) {
		
		this.personDao = personDao;
	}

	public void save(){
		
		personDao.add();
	}
}
