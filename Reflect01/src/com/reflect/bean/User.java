package com.reflect.bean;

import java.util.Date;

public class User {

	private Integer id;
	private String name;
	private String password;
	private Date birth;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String name, String password, Date birth) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", birth=" + birth + "]";
	}
}
