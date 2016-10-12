package com.s.test;

import java.util.Scanner;

public class Test {

	@org.junit.Test
	public void test() {
		
		Scanner reader = new Scanner(System.in);
		/**
		 * 执行nextLine等方法时会堵塞，等待用户在命令行中输入数据回车确认
		 */
		String str = reader.nextLine();
		System.out.println(str);
		while (reader.hasNextInt()) {
			int i = reader.nextInt();
			System.out.println(i);
		}
		/**
		 * 输入：12.34（回车）
		 * 那么reader对象调用hasNextDouble返回的值是true，若调用hasNextInt返回的值是false
		 */
		while (reader.hasNextDouble()) {
			double i = reader.nextDouble();
			System.out.println(i);
		}
	}
}
