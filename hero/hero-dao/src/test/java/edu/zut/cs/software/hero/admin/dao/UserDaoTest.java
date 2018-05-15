package edu.zut.cs.software.hero.admin.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.admin.domain.User;



public class UserDaoTest {
	@Autowired
	UserDao userDao;
	@Test
	public void test() {
		List<User> result = this.userDao.findAll();
	}

}
