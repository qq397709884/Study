package com.io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {

	@org.junit.Test
	public void test() {
		
		String filename = "src/test.txt";  
        String message = "Hello world";  
        byte[] bytes = message.getBytes(); 
        save(filename, bytes);   
        read(filename); 
	}
	
	public void save(String filename, byte[] bytes) {  
        
        FileOutputStream fos = null;  
        try {  
            fos = new FileOutputStream(filename);  
            fos.write(bytes);  
            fos.close();  
        }catch(Exception e) {
        	e.printStackTrace();
        }  
    }  
	
	public void read(String filename) {  
        
        FileInputStream fis = null;  
        try {  
            fis = new FileInputStream(filename);
            int result;
            /**
             * fis.read()表示从输入流fis中读取一个字节，如果指针指向文件末尾，则返回 -1
             */
			while ((result = fis.read()) != -1) {
				System.out.print((char)result);
			}
            fis.close();  
        }catch(Exception e) {
        	e.printStackTrace();
        }  
    } 
}
