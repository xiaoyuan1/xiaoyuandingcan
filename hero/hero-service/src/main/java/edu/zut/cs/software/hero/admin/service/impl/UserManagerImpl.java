package edu.zut.cs.software.hero.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.software.hero.admin.dao.UserDao;
import edu.zut.cs.software.hero.admin.domain.User;
import edu.zut.cs.software.hero.admin.service.UserManager;
import edu.zut.cs.software.hero.base.service.impl.GenericManagerImpl;
@Service
public class UserManagerImpl extends GenericManagerImpl<User, Long> implements UserManager{
	UserDao userDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
		this.dao = this.userDao;
	}

	@Override
	public User findbyUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
}
