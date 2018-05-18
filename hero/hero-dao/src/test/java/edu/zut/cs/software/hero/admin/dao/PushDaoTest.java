package edu.zut.cs.software.hero.admin.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import edu.zut.cs.software.hero.admin.domain.Push;
import edu.zut.cs.software.hero.base.dao.GenericDaoTestCase;


public class PushDaoTest extends GenericDaoTestCase<Long, Push, PushDao> {

	@Autowired
    PushDao pushDao;

	@Test
	public void test() {
		Push push = new Push();
		push.setMessage("111111111111111");
		push.setLucky("zexing");
		push.setFood("beat");
		Push test_push = this.pushDao.save(push);
		Push result = new Push();
		assertEquals(test_push, result);
	}

}
