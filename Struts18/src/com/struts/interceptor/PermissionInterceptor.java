package com.struts.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class PermissionInterceptor implements Interceptor {

	@Override
	public void init() {
		
		System.out.println("init");
	}
	
	@Override
	public void destroy() {
		
		System.out.println("destroy");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		
		Object name = ActionContext.getContext().getSession().get("Name");
		if(name != null) {
			return ai.invoke();
		}
		return "login";
	}
}
