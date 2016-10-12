package com.resume.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.resume.domain.Skill;

import cn.itcast.jdbc.TxQueryRunner;

public class SkillDao {
	
	private QueryRunner qr = new TxQueryRunner();
	
	public Skill findSkillByUid(String uid) {
		
		try {
			String sql = "select * from t_skill where uid=?";
			return qr.query(sql, new BeanHandler<Skill>(Skill.class), uid);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
