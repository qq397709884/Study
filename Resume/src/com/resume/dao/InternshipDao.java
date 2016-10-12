package com.resume.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.resume.domain.Internship;

import cn.itcast.jdbc.TxQueryRunner;

public class InternshipDao {

	private QueryRunner qr = new TxQueryRunner();
	
	public List<Internship> findAllInternshipByUid(String uid) {
		
		try {
			String sql = "select * from t_internship where uid=?";
			return qr.query(sql, new BeanListHandler<Internship>(Internship.class), uid);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
