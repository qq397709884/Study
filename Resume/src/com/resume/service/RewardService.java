package com.resume.service;

import java.util.List;

import com.resume.dao.RewardDao;
import com.resume.domain.Reward;

public class RewardService {

	private RewardDao rewardDao = new RewardDao();
	
	public List<Reward> findAllRewardByUid(String uid) {
		
		return rewardDao.findAllRewardByUid(uid);
	} 
}
