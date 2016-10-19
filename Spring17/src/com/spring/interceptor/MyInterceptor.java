package com.spring.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 声明把MyInterceptor类作为一个切面
 */
@Aspect
public class MyInterceptor {
	
	/**
	 * 定义一个切入点
	 */
	@Pointcut("execution(* com.spring.service.impl.PersonServiceBean.*(..))")
	private void qrd() {}
	
	/**
	 * 定义前置通知
	 */
	@Before("qrd()")
	public void qztz() {
		
		System.out.println("前置通知");
	}
	
	/**
	 * 定义后置通知
	 */
	@AfterReturning(("qrd()"))
	public void hztz() {
		
		System.out.println("后置通知");
	}
	
	/**
	 * 定义最终通知
	 */
	@After("qrd()")
	public void zztz() {
		
		System.out.println("最终通知");
	}
	
	/**
	 * 定义异常通知
	 */
	@AfterThrowing(("qrd()"))
	public void yctz() {
		
		System.out.println("例外通知");
	}
	
	/**
	 * 定义环绕通知
	 */
	@Around("qrd()")
	public Object hrtz(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("进入方法");
		Object result = pjp.proceed();
		System.out.println("退出方法");
		return result;
	}	
}
