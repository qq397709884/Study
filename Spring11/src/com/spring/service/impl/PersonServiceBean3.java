package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.dao.PersonDao;
import com.spring.service.PersonService;

public class PersonServiceBean3 implements PersonService {

	/**
	 * @Autowired(required=true)表示必须为personDao注入值
	 * @Qualifier("personDao")指定注入name为personDao的bean，如果不存在则异常
	 */
	@Autowired(required=true)
	@Qualifier("personDao")
	private PersonDao personDao;

	public PersonServiceBean3() {}

	public PersonServiceBean3(PersonDao personDao) {
		
		this.personDao = personDao;
	}

	public void save(){
		
		personDao.add();
	}
}
