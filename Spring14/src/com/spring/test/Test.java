package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.PersonDao;
import com.spring.service.PersonService;

public class Test {

	@org.junit.Test
	public void test() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService1 = (PersonService)ctx.getBean("personService");
		PersonService personService2 = (PersonService)ctx.getBean("personService");
		System.out.println(personService1 == personService2);
		PersonDao personDao = (PersonDao)ctx.getBean("personDaoBean");
		personDao.add();
	}
}
