package com.resume.service;

import java.util.List;

import com.resume.dao.EducationDao;
import com.resume.domain.Education;

public class EducationService {

	private EducationDao educationDao = new EducationDao();
	
	public List<Education> findAllEducationByUid(String uid) {
		
		return educationDao.findAllEducationByUid(uid);
	}
}
