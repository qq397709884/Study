package cn.hwd.ssm.dao.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hwd.ssm.bean.User;
import cn.hwd.ssm.dao.UserDao;

public class UserDaoImplTest {

	@Test
	public void testFindUserById() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml"); 
		UserDao userDao = (UserDao) ac.getBean("userDao");  
		User user = userDao.findUserById(1);
		System.out.println(user);
	}

}
