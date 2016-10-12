package com.resume.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.resume.domain.Certificate;

import cn.itcast.jdbc.TxQueryRunner;

public class CertificateDao {

	private QueryRunner qr = new TxQueryRunner();
	
	public List<Certificate> findAllCertificateByUid(String uid) {
		
		try {
			String sql = "select * from t_certificate where uid=?";
			return qr.query(sql, new BeanListHandler<Certificate>(Certificate.class), uid);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
