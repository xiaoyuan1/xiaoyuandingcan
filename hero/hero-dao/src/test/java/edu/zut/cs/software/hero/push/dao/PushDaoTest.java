package edu.zut.cs.software.hero.push.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.software.hero.base.dao.DaoConfig;
import edu.zut.cs.software.hero.push.domain.Push;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DaoConfig.class)
public class PushDaoTest {

	@Autowired
    PushDao pushDao;

	@Test
	void test() {
		String pushname = "world";
		Push query = new Push();
		Push expected = new Push();
		
	}

}
