package com.struts.action;

public class HelloAction {

	private String message;
	
	public String getMessage() {
		
		return message;
	}
	
	public String execute() {
		
		this.message = "hello world";
		return "success";
	}
}
