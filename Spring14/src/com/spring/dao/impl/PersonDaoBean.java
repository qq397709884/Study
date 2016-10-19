package com.spring.dao.impl;

import org.springframework.stereotype.Repository;

import com.spring.dao.PersonDao;

@Repository
public class PersonDaoBean implements PersonDao {

	public void add() {
		
		System.out.println("PersonDaoBean add");
	}
}
