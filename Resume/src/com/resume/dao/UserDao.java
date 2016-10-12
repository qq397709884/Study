package com.resume.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.itcast.jdbc.TxQueryRunner;

public class UserDao {

	private QueryRunner qr = new TxQueryRunner();
	
	public String findIdByName(String name) {
		
		try {
			String sql = "select id from t_user where name=?";
			return String.valueOf(qr.query(sql, new ScalarHandler(), name));
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
