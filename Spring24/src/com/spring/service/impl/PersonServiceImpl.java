package com.spring.service.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.bean.Person;
import com.spring.service.PersonService;

public class PersonServiceImpl implements PersonService {
	 
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void save(Person person) {
		jdbcTemplate.update("insert into person(id,name) values(?,?)", 
				new Object[]{person.getId(), person.getName()},
				new int[]{java.sql.Types.INTEGER, java.sql.Types.VARCHAR});
	}

	@Override
	public void update(Person person) {
		jdbcTemplate.update("update person set name=? where id=?", 
				new Object[]{person.getName(), person.getId()},
				new int[]{java.sql.Types.VARCHAR, java.sql.Types.INTEGER});
	}

	@SuppressWarnings("unchecked")
	@Override
	public Person getPerson(Integer id) {
		return (Person)jdbcTemplate.queryForObject("select * from person where id=?", 
				new Object[]{id}, 
				new int[]{java.sql.Types.INTEGER}, 
				new PersonRowMapper());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> getPersons() {
		return (List<Person>)jdbcTemplate.query("select * from person", 
				new PersonRowMapper());
	}

	@Override
	public void delete(Integer id) {
		jdbcTemplate.update("delete from person where id=?", 
				new Object[]{id},
				new int[]{java.sql.Types.INTEGER});
	}
	
}
