package edu.zut.cs.software.hero.admin.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.software.hero.admin.domain.Push;
import edu.zut.cs.software.hero.base.dao.DaoConfig;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DaoConfig.class)
public class PushDaoTest {

	@Autowired
    PushDao pushDao;

	@Test
	void test() {
		String pushname = "world";
		Push query = new Push();
		// List<User> result = this.userDao.findOne(null);
		Push expectedFoot = new Push();
		// expectedUser.setUsername(username);
		// assertEquals(user, expectedUser);
		// assertEquals(user.getUsername(), expectedUser.getUsername());
	}

}
