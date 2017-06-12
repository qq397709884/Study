package com.ibatis.dao;

import java.util.List;

import com.ibatis.bean.User;

public interface UserDao {

	public List<User> findAllUser();
	
	public User findUserById(int id);
	
	public List<User> findUserByName(String name);
	
	public void insertUser(User user);
	
	public void deleteUserById(int id);
	
	public void updateUserById(User user);
}
