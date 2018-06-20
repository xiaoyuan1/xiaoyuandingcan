package edu.zut.cs.software.hero.push.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.hero.push.domain.Push;

/**
 * @author zengzexing
 * 功能介绍：测试dao
 * 
 * */

public class PushDaoTest extends GenericDaoTestCase<Long, Push, PushDao> {

	@Autowired
    PushDao pushDao;

	@Test
	public void test() {
		Push r = new Push();
		r.setFood("test_push");
		Push test_role = this.pushDao.save(r);
		Long role_id = test_role.getId();
		Push result = this.pushDao.getOne(role_id);
		assertEquals(test_role, result);
		List<Push> all = this.pushDao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Push> all size ={}", all.size()); //$NON-NLS-1$
		}
	}

}
