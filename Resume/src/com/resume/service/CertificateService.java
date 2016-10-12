package com.resume.service;

import java.util.List;

import com.resume.dao.CertificateDao;
import com.resume.domain.Certificate;

public class CertificateService {

	private CertificateDao certificateDao = new CertificateDao();
	
	public List<Certificate> findAllCertificateByUid(String uid) {
		
		return certificateDao.findAllCertificateByUid(uid);
	} 
}
