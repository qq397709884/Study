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
		for(String value : personService.getSets()){
			System.out.println(value);
		}
		for(String value : personService.getLists()){
			System.out.println(value);
		}
		for(Object key : personService.getProperties().keySet()){
			System.out.println(key+"="+ personService.getProperties().getProperty((String)key));
		}
		for(String key : personService.getMaps().keySet()){
			System.out.println(key+"="+ personService.getMaps().get(key));
		}
	}
}
