package com.resume.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.resume.domain.Reward;

import cn.itcast.jdbc.TxQueryRunner;

public class RewardDao {

	private QueryRunner qr = new TxQueryRunner();
	
	public List<Reward> findAllRewardByUid(String uid) {
		
		try {
			String sql = "select * from t_reward where uid=?";
			return qr.query(sql, new BeanListHandler<Reward>(Reward.class), uid);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
