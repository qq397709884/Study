package com.resume.service;

import com.resume.dao.UserDao;

public class UserService {

	private UserDao userDao = new UserDao();
	
	public String findIdByName(String name) {
		
		return userDao.findIdByName(name);
	}
}
