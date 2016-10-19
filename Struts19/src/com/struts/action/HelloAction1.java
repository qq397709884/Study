package com.struts.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class HelloAction1 extends ActionSupport {

	private String name;

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}
	
	public String save() {
		
		ActionContext.getContext().put("message", "HelloAction1 save");
		return "success";
	}
	
	public String update() {
		
		ActionContext.getContext().put("message", "HelloAction1 update");
		return "success";
	}
	
	/**
	 * validate()会对action中的所有方法校验，包括save和update方法
	 * 先校验，再执行action中的处理方法
	 */
	public void validate() {
		
		if(this.name==null || "".equals(this.name.trim())){
			this.addFieldError("name", "用户名不能为空");
		}
	}
}
