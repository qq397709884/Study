package com.struts.type.converter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class DateTypeConverter extends DefaultTypeConverter {

	@Override
	public Object convertValue(Map<String, Object> context, 
			Object value, Class toType) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		try { 
			if (toType == Date.class) {
				String[] params = (String[])value;
				return dateFormat.parse(params[0]);
			} else if(toType == String.class) {
				Date date = (Date)value;
				return dateFormat.format(date);
			}
		} catch (Exception e) {}
		return null;
	}
}
