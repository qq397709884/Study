package com.struts.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

public class HelloAction3 implements ServletRequestAware, ServletContextAware {

	private ServletContext servletContext;
	private HttpServletRequest request;

	public void setServletContext(ServletContext servletContext) {
		
		this.servletContext = servletContext;
	}

	public void setServletRequest(HttpServletRequest request) {
		
		this.request = request;
	}
	
	public String execute() {

		request.setAttribute("req", "request");
		request.getSession().setAttribute("ses", "session");
		servletContext.setAttribute("app", "application");
		return "success";
	}
}
