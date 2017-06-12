package com.ibatis.test;

import java.util.List;

import org.junit.Test;

import com.ibatis.bean.User;
import com.ibatis.dao.impl.UserDaoImpl;

public class UserDaoImplTest {

	@Test
	public void testFindAllUser() {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		List<User> userList = userDaoImpl.findAllUser();
		for (User user : userList) {
			System.out.println(user.toString());
		}
	}
	
	@Test
	public void testFindUserById() {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		User user = userDaoImpl.findUserById(2);
		System.out.println(user.toString());
	}

	@Test
	public void testFindUserByName() {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		List<User> userList = userDaoImpl.findUserByName("e");
		for (User user : userList) {
			System.out.println(user.toString());
		}
	}
	
	@Test
	public void testInsertUser() {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		userDaoImpl.insertUser(new User(3, "Diana", "123456"));
	}
	
	@Test
	public void testDeleteUserById() {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		userDaoImpl.deleteUserById(3);
	}
	
	@Test
	public void testUpdateUserById() {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		userDaoImpl.updateUserById(new User(3, "Test", "789"));
	}
	
}
