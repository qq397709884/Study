package com.jw.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AFilter implements Filter {

	public void destroy() {
		
		System.out.println("销毁");
	}

	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain chain) throws IOException, ServletException {

		System.out.println("拦截前");
		chain.doFilter(request, response);//放行！
		System.out.println("拦截后");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
		System.out.println("开始");
	}
}
