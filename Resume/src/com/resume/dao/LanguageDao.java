package com.resume.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.resume.domain.Language;

import cn.itcast.jdbc.TxQueryRunner;

public class LanguageDao {

	private QueryRunner qr = new TxQueryRunner();
	
	public List<Language> findAllLanguageByUid(String uid) {
		
		try {
			String sql = "select * from t_language where uid=?";
			return qr.query(sql, new BeanListHandler<Language>(Language.class), uid);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
