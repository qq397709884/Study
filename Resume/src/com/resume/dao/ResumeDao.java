package com.resume.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.itcast.jdbc.TxQueryRunner;

public class ResumeDao {

	private QueryRunner qr = new TxQueryRunner();
	
	public String findName() {
		
		try {
			String sql = "select name from t_resume";
			return String.valueOf(qr.query(sql, new ScalarHandler()));
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
