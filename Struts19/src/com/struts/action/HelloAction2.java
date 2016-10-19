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
	
	/**
	 * validateSave()只会对action中的save方法校验，不包括update方法
	 * 系统会先调用validateSave方法，然后再调用validate方法
	 * 先校验，再执行action中的处理方法
	 */
	public void validateSave() {
		
		if(this.name==null || "".equals(this.name.trim())){
			this.addFieldError("name", "用户名不能为空");
		}
	}
}