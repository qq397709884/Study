package com.c.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.c.bean.User;

public class Test {

	@org.junit.Test
	public void test() throws Exception {
		
		System.out.println("1、Class类");  
        Class<?> clazz = Class.forName("com.c.bean.User");//返回指定类名的Class对象  
        System.out.println(clazz);  
        System.out.println(User.class);  
          
        System.out.println("2、类的属性");  
        Field[] fields = clazz.getDeclaredFields();//获取所有的属性  
        for (Field field : fields) {  
            String modifier = Modifier.toString(field.getModifiers());//属性的修饰符  
            String type = field.getType().getSimpleName();//属性的类型的名称  
            String name = field.getName();//属性的名称  
            System.out.println(modifier + " " + type + " " + name);  
        }  
          
        System.out.println("3、类的构造方法");  
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();//获取所有的构造方法  
        for (Constructor<?> constructor : constructors) {  
            StringBuffer sb = new StringBuffer();  
            String modifier = Modifier.toString(constructor.getModifiers());//构造方法的修饰符  
            String name = constructor.getName();//构造方法的名称  
            sb.append(modifier + " " + name + "(");  
            Class<?>[] parameters = constructor.getParameterTypes();//获取构造方法的所有参数的类型  
            for (int i = 0; i < parameters.length; ++i) {  
                String parameterName = parameters[i].getName();  
                sb.append(parameterName);  
                if (i != parameters.length - 1) {  
                    sb.append(", ");  
                }  
            }  
            sb.append(")");  
            System.out.println(sb);  
        }  
          
        System.out.println("4、类的方法");  
        Method[] methods = clazz.getDeclaredMethods();//获取所有的类的方法  
        for (Method method : methods) {  
            StringBuffer sb = new StringBuffer();  
            String modifier = Modifier.toString(method.getModifiers());//类的方法的修饰符  
            String name = method.getName();//类的方法的名称  
            sb.append(modifier + " " + name + "(");  
            Class<?>[] parameters = method.getParameterTypes();//获取类的方法的所有参数的类型  
            for (int i = 0; i < parameters.length; ++i) {  
                String parameterName = parameters[i].getName();  
                sb.append(parameterName);  
                if (i != parameters.length - 1) {  
                    sb.append(", ");  
                }  
            }  
            sb.append(")");  
            System.out.println(sb);  
        }  
	}
}
