package com.spring.service.impl;

import com.spring.service.PersonService;

public class PersonServiceBean implements PersonService {

	public void init(){
		
		System.out.println("初始化");
	}
	
	public PersonServiceBean(){
		
		System.out.println("我被实例化了");
	}
	
	public void save(){
		
		System.out.println("执行了PersonServiceBean的save方法");
	}
	
	public void destory(){
		
		System.out.println("开闭打开的资源");
	}
}
