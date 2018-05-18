package edu.zut.cs.software.hero.admin.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.software.hero.admin.domain.Depot;

import edu.zut.cs.software.hero.base.dao.DaoConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DaoConfig.class)
public class DepotDaoTest {

	@Autowired
	DepotDao depotDao;
	@Test
	public void test() {
		String depotname = "world";
		Depot query = new Depot();
		// List<User> result = this.userDao.findOne(null);
		Depot expected = new Depot();
		// expectedUser.setUsername(username);
		// assertEquals(user, expectedUser);
		// assertEquals(user.getUsername(), expectedUser.getUsername());
		
		fail("Not yet implemented");
	}

}
