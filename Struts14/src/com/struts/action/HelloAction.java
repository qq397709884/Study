package com.struts.action;

import java.util.Date;

public class HelloAction {

	private Date birthday;

	public Date getBirthday() {
		
		return birthday;
	}

	public void setBirthday(Date birthday) {
		
		this.birthday = birthday;
	}

	public String execute() {

		return "success";
	}
}
