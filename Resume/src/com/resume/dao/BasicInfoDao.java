package com.resume.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.resume.domain.BasicInfo;

import cn.itcast.jdbc.TxQueryRunner;

public class BasicInfoDao {
	
	private QueryRunner qr = new TxQueryRunner();
	
	public BasicInfo findBasicInfoByUid(String uid) {
		
		try {
			String sql = "select * from t_basic_info where uid=?";
			return qr.query(sql, new BeanHandler<BasicInfo>(BasicInfo.class), uid);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}

