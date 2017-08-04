package cn.hwd.ssm.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.hwd.ssm.bean.User;
import cn.hwd.ssm.dao.UserDao;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
    private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public User findUserById(int id) {
		return (User) sqlSessionTemplate.selectOne("cn.hwd.ssm.dao.UserDao.findUserById", id);
	}

}
