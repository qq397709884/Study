package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.PersonService;

public class Test {

	@org.junit.Test
	public void test1() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService = (PersonService)ctx.getBean("personService1");
		personService.save();
	}
	
	@org.junit.Test
	public void test2() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService = (PersonService)ctx.getBean("personService2");
		personService.save();
	}
	
	@org.junit.Test
	public void test3() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService = (PersonService)ctx.getBean("personService3");
		personService.save();
	}
	
	@org.junit.Test
	public void test4() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService = (PersonService)ctx.getBean("personService4");
		personService.save();
	}
	
	@org.junit.Test
	public void test5() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService = (PersonService)ctx.getBean("personService5");
		personService.save();
	}
	
	@org.junit.Test
	public void test6() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService = (PersonService)ctx.getBean("personService6");
		personService.save();
	}
}
