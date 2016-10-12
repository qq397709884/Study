package com.resume.service;

import com.resume.dao.BasicInfoDao;
import com.resume.domain.BasicInfo;

public class BasicInfoService {

	private BasicInfoDao basicInfoDao = new BasicInfoDao();
	
	public BasicInfo findBasicInfoByUid(String uid) {
		
		return basicInfoDao.findBasicInfoByUid(uid);
	}
}
