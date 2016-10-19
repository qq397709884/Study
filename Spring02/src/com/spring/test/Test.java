package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.PersonService;

public class Test {

	@org.junit.Test
	public void test1() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService = (PersonService)ctx.getBean("personService");
		personService.save();
	}
	
	@org.junit.Test
	public void test2() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService1 = (PersonService)ctx.getBean("personService");
		PersonService personService2 = (PersonService)ctx.getBean("personService");
		System.out.println(personService1==personService2);
	}
}
