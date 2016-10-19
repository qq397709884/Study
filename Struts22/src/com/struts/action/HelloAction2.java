package com.struts.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class HelloAction2 extends ActionSupport {

	private String name;

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}
	
	public String save() {
		
		ActionContext.getContext().put("message", "HelloAction2 save");
		return "success";
	}
	
	public String update() {
		
		ActionContext.getContext().put("message", "HelloAction2 update");
		return "success";
	}
}
