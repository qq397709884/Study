package com.ibatis.dao.impl;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.bean.User;
import com.ibatis.common.resources.Resources;
import com.ibatis.dao.UserDao;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class UserDaoImpl implements UserDao {

	private static SqlMapClient sqlMapClient = null;

    // ∂¡»°≈‰÷√Œƒº˛
    static {
        try {
            Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");
            sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
	@Override
	public List<User> findAllUser() {
		List<User> userList = null;
		try {
			userList = sqlMapClient.queryForList("findAllUser");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}

	@Override
	public User findUserById(int id) {
		User user = null;
		try {
			user = (User) sqlMapClient.queryForObject("findUserById", id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	@Override
	public List<User> findUserByName(String name) {
		List<User> userList = null;
		try {
			userList = sqlMapClient.queryForList("findUserByName", name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}

	@Override
	public void insertUser(User user) {
		try {
			sqlMapClient.insert("insertUser", user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteUserById(int id) {
		try {
			sqlMapClient.delete("deleteUserById", id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateUserById(User user) {
		try {
			sqlMapClient.update("updateUserById", user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
