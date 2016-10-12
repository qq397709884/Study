package com.resume.service;

import java.util.List;

import com.resume.dao.ProjectDao;
import com.resume.domain.Project;

public class ProjectService {

	private ProjectDao projectDao = new ProjectDao();
	
	public List<Project> findAllProjectByUid(String uid) {
		
		return projectDao.findAllProjectByUid(uid);
	} 
}
