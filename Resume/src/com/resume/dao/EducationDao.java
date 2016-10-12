package com.resume.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.resume.domain.Education;

import cn.itcast.jdbc.TxQueryRunner;

public class EducationDao {

	private QueryRunner qr = new TxQueryRunner();
	
	public List<Education> findAllEducationByUid(String uid) {
		
		try {
			String sql = "select * from t_education where uid=?";
			return qr.query(sql, new BeanListHandler<Education>(Education.class), uid);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
