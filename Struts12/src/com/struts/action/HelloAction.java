package com.struts.action;

import com.struts.bean.Person;

public class HelloAction {

	private Integer id;
	private Person person;

	public Integer getId() {
		
		return id;
	}

	public void setId(Integer id) {
		
		this.id = id;
	}

	public Person getPerson() {
		
		return person;
	}

	public void setPerson(Person person) {
		
		this.person = person;
	}

	public String execute() {

		return "success";
	}
}
