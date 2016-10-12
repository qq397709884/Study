package com.resume.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.resume.domain.BasicInfo;
import com.resume.domain.Certificate;
import com.resume.domain.Education;
import com.resume.domain.Internship;
import com.resume.domain.Language;
import com.resume.domain.Project;
import com.resume.domain.Reward;
import com.resume.domain.Skill;
import com.resume.service.BasicInfoService;
import com.resume.service.CertificateService;
import com.resume.service.EducationService;
import com.resume.service.InternshipService;
import com.resume.service.LanguageService;
import com.resume.service.ProjectService;
import com.resume.service.ResumeService;
import com.resume.service.RewardService;
import com.resume.service.SkillService;
import com.resume.service.UserService;

public class IndexServlet extends HttpServlet {
	
	private ResumeService resumeService = new ResumeService();
	private UserService userService = new UserService();
	private BasicInfoService basicInfoService = new BasicInfoService();
	private EducationService educationService = new EducationService();
	private ProjectService projectService = new ProjectService();
	private LanguageService languageService = new LanguageService();
	private SkillService skillService = new SkillService();
	private CertificateService certificateService = new CertificateService();
	private RewardService rewardService = new RewardService();
	private InternshipService internshipService = new InternshipService();
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		String name = resumeService.findName();
		String id = userService.findIdByName(name);
		BasicInfo basicInfo = basicInfoService.findBasicInfoByUid(id);
		List<Education> educations = educationService.findAllEducationByUid(id);
		List<Project> projects = projectService.findAllProjectByUid(id);
		List<Language> languages = languageService.findAllLanguageByUid(id);
		Skill skill = skillService.findSkillByUid(id);
		List<Certificate> certificates = certificateService.findAllCertificateByUid(id);
		List<Reward> rewards = rewardService.findAllRewardByUid(id);
		List<Internship> internships = internshipService.findAllInternshipByUid(id);
		request.setAttribute("basicInfo", basicInfo);
		request.setAttribute("educations", educations);
		request.setAttribute("projects", projects);
		request.setAttribute("languages", languages);
		request.setAttribute("skill", skill);
		request.setAttribute("certificates", certificates);
		request.setAttribute("rewards", rewards);
		request.setAttribute("internships", internships);
		request.getRequestDispatcher("/WEB-INF/page/index.jsp").forward(request, response);
	}
}
