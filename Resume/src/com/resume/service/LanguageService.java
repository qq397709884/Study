package com.resume.service;

import java.util.List;

import com.resume.dao.LanguageDao;
import com.resume.domain.Language;

public class LanguageService {

	private LanguageDao languageDao = new LanguageDao();
	
	public List<Language> findAllLanguageByUid(String uid) {
		
		return languageDao.findAllLanguageByUid(uid);
	} 
}
