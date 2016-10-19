package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.PersonService;

public class Test {

	@org.junit.Test
	public void test1() {
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService = (PersonService)cxt.getBean("personServiceBean");
		personService.findName(1);
	}
	
	@org.junit.Test
	public void test2() {
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService = (PersonService)cxt.getBean("personServiceBean");
		personService.save("xxx");
	}
	
	@org.junit.Test
	public void test3() {
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService = (PersonService)cxt.getBean("personServiceBean");
		personService.update("xxx");
	}
}
