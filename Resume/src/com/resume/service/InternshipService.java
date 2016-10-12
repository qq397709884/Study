package com.resume.service;

import java.util.List;

import com.resume.dao.InternshipDao;
import com.resume.domain.Internship;

public class InternshipService {

	private InternshipDao internshipDao = new InternshipDao();
	
	public List<Internship> findAllInternshipByUid(String uid) {
		
		return internshipDao.findAllInternshipByUid(uid);
	} 
}
