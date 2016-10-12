package com.resume.service;

import com.resume.dao.ResumeDao;

public class ResumeService {

	private ResumeDao resumeDao = new ResumeDao();
	
	public String findName() {
		
		return resumeDao.findName();
	}
}
