package com.struts.action;

public class HelloAction {

	private String message;
	
	public String getMessage() {
		
		return message;
	}

	public void setMessage(String message) {
		
		this.message = message;
	}

	public String execute() {
		
		return "success";
	}
}
