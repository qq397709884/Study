package com.spring.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.spring.dao.PersonDao;
import com.spring.service.PersonService;

/**
 * @Scope("prototype")指定创建bean的模式
 */
@Service("personService") 
@Scope("prototype")
public class PersonServiceBean implements PersonService {

	private PersonDao personDao;
	
	/**
	 * @PostConstruct指定初始化bean之后调用的方法
	 */
	@PostConstruct
	public void init() {
		
		System.out.println("init");
	}
	
	/**
	 * @PreDestroy指定销毁bean之前调用的方法
	 */
	@PreDestroy
	public void destory() {
		
		System.out.println("destory");
	}
	
	public PersonServiceBean() {}

	public PersonServiceBean(PersonDao personDao) {
		
		this.personDao = personDao;
	}

	public void save() {
		
		personDao.add();
	}
}
