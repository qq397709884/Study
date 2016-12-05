package com.spring.test;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Person;
import com.spring.service.PersonService;

public class PersonServiceImplTest {

	private static PersonService personService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		personService = (PersonService)ctx.getBean("personService");
	}

	@Test
	public void testSave() {
		Person person = new Person(1, "Tom");
		personService.save(person);
	}

	@Test
	public void testUpdate() {
		Person person = new Person(1, "Jerry");
		personService.update(person);
	}

	@Test
	public void testGetPerson() {
		Person person = personService.getPerson(1);
		System.out.println(person);
	}

	@Test
	public void testGetPersons() {
		List<Person> persons = personService.getPersons();
		System.out.println(persons);
	}

	@Test
	public void testDelete() {
		personService.delete(1);
	}
	
}
