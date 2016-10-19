package com.struts.action;

public class HelloAction {

	private String message;
	
	public String getMessage() {
		
		return message;
	}
	
	public String save() {
		
		this.message = "save";
		return "success";
	}
	
	public String update() {
		
		this.message = "update";
		return "success";
	}
	
	public String execute() {
		
		this.message = "execute";
		return "success";
	}
}
