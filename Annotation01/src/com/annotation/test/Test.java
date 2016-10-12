package com.annotation.test;

import java.lang.reflect.Field;

import com.annotation.annotation.FruitColor;
import com.annotation.annotation.FruitName;
import com.annotation.annotation.FruitProvider;
import com.annotation.bean.Fruit;

public class Test {

	@org.junit.Test
	public void test() {
		
		//Class<?>表示通配泛型，?可以代表任何类型
	    //返回Fruit类的Class对象
	    Class<?> clazz = Fruit.class;
	    //返回Class对象中所有的字段
	    Field[] fields = clazz.getDeclaredFields();
	    for(Field field :fields){
	        //isAnnotationPresent，这种方法指定注解类型的注解存在于此元素上，则返回true，否则返回false
	        if(field.isAnnotationPresent(FruitName.class)){
	            //getAnnotation，返回指定类型的注解，如果该类型注解不存在，则返回null
	            FruitName fruitName = (FruitName)field.getAnnotation(FruitName.class);
	            System.out.println(fruitName.value());
	        }
	        else if(field.isAnnotationPresent(FruitColor.class)){
	          FruitColor fruitColor= (FruitColor) field.getAnnotation(FruitColor.class);
	          System.out.println(fruitColor.fruitColor().toString());
	        }
	        else if(field.isAnnotationPresent(FruitProvider.class)){
	            FruitProvider fruitProvider= (FruitProvider) field.getAnnotation(FruitProvider.class);
	            System.out.println(fruitProvider.id()+"、"+fruitProvider.name()+"、"+fruitProvider.address());
	        }
	    }
	}
}
