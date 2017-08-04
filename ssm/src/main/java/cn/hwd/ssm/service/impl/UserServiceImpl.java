package cn.hwd.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hwd.ssm.bean.User;
import cn.hwd.ssm.dao.UserDao;
import cn.hwd.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserDao userDao;
	
	@Override
	public User findUserById(int id) throws Exception {
        return userDao.findUserById(id);
	}

}
