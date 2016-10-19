package com.struts.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class HelloAction2 {

	public String execute() {

		ServletContext servletContext = ServletActionContext.getServletContext();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		HttpServletResponse response = ServletActionContext.getResponse();
		request.setAttribute("req", "request");
		session.setAttribute("ses", "session");
		servletContext.setAttribute("app", "application");
		return "success";
	}
}
