package com.struts.action;

import com.opensymphony.xwork2.ActionContext;

public class HelloAction1 {

	public String execute() {

		ActionContext ctx = ActionContext.getContext();
		ctx.getApplication().put("app", "application");
		ctx.getSession().put("ses", "session");
		ctx.put("req", "request");
		return "success";
	}
}
