package edu.zut.cs.software.hero.user.dao;

import static org.junit.Assert.*;

import java.util.List;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;



import edu.zut.cs.software.hero.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.hero.user.domain.User;



public class UserDaoTest extends GenericDaoTestCase<Long, User, UserDao>  {
	@Autowired
	UserDao userDao;
	@Test
	public void test() {
		User u = new User();
		u.setUsername("test_user");
		User test_user = this.userDao.save(u);
		Long user_id = test_user.getId();
		User result = this.userDao.getOne(user_id);
		assertEquals(test_user, result);
		//List<User> all = this.userDao.findAll();
	}

}
