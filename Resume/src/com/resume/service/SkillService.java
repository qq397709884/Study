package com.resume.service;

import com.resume.dao.SkillDao;
import com.resume.domain.Skill;

public class SkillService {
	
	private SkillDao skillDao = new SkillDao();
	
	public Skill findSkillByUid(String uid) {
		
		return skillDao.findSkillByUid(uid);
	}
}
