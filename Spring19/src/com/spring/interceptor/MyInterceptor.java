package com.spring.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyInterceptor {

	public void qztz() {
		
		System.out.println("前置通知");
	}

	public void hztz() {
		
		System.out.println("后置通知");
	}

	public void zztz() {
		
		System.out.println("最终通知");
	}

	public void yctz() {
		
		System.out.println("例外通知");
	}

	public Object hrtz(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("进入方法");
		Object result = pjp.proceed();
		System.out.println("退出方法");
		return result;
	}	
}
