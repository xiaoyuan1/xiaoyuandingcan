package edu.zut.cs.software.hero.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import edu.zut.cs.software.hero.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.hero.user.dao.UserDao;
import edu.zut.cs.software.hero.user.domain.User;
import edu.zut.cs.software.hero.user.service.UserManager;
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
