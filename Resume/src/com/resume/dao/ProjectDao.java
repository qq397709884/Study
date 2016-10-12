package com.resume.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.resume.domain.Project;

import cn.itcast.jdbc.TxQueryRunner;

public class ProjectDao {

	private QueryRunner qr = new TxQueryRunner();
	
	public List<Project> findAllProjectByUid(String uid) {
		
		try {
			String sql = "select * from t_project where uid=?";
			return qr.query(sql, new BeanListHandler<Project>(Project.class), uid);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
