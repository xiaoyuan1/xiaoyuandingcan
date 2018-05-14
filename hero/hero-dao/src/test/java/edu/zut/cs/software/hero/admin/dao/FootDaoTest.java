package edu.zut.cs.software.hero.admin.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.software.hero.admin.domain.Foot;
import edu.zut.cs.software.hero.base.dao.DaoConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DaoConfig.class)
class FootDaoTest {

	@Autowired
	FootDao footDao;

	@Test
	void test() {
		String footname = "world";
		Foot query = new Foot();
		// List<User> result = this.userDao.findOne(null);
		Foot expectedFoot = new Foot();
		// expectedUser.setUsername(username);
		// assertEquals(user, expectedUser);
		// assertEquals(user.getUsername(), expectedUser.getUsername());
	}

}
