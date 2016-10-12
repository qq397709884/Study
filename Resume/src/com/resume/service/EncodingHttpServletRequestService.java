package com.resume.service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class EncodingHttpServletRequestService extends HttpServletRequestWrapper {

	private HttpServletRequest request;
	private String encoding;

	public EncodingHttpServletRequestService(HttpServletRequest request, String encoding) {
		
		super(request);
		this.request = request;
		this.encoding = encoding;
	}
	
	public String getParameter(String name) {
		
		String value = request.getParameter(name);
		if (value != null) {
			try {
				//根据指定的编码返回某字符串在该编码下的字节数组
				byte[] bytes = value.getBytes("iso-8859-1");
				//使用指定的编码来将字节数组解析成字符串
				value = new String(bytes, encoding);
			} catch (UnsupportedEncodingException e) {
				throw new RuntimeException(e);
			}
		}
		return value;
	}
}
