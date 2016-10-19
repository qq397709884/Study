package com.spring.service.impl;

import javax.annotation.Resource;

import com.spring.dao.PersonDao;
import com.spring.service.PersonService;

public class PersonServiceBean5 implements PersonService {

	/**
	 * @Resource(name="personDao")指定注入name为personDao的bean，如果不存在则异常
	 */
	@Resource(name="personDao")
	private PersonDao personDao;
	
	public PersonServiceBean5() {}

	public PersonServiceBean5(PersonDao personDao) {
		
		this.personDao = personDao;
	}

	public void save(){
		
		personDao.add();
	}
}
