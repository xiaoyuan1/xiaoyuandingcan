package edu.zut.cs.software.hero.Dingdan.dao;

import static org.junit.Assert.*;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import edu.zut.cs.software.hero.base.dao.GenericTreeDaoTestCase;
import edu.zut.cs.software.hero.dingdan.dao.DingdanDao;
import edu.zut.cs.software.hero.dingdan.domain.Dingdan;

/**
 * 
 * @author zhangyaohui
 *功能介绍：测试dao是否可以成功运行
 */
public class DingdanDaoTest extends GenericTreeDaoTestCase<Long, Dingdan, DingdanDao> {

	/**
	 * Logger for this class
	 */
	//private static final Logger logger = Logger.getLogger(DingdanDaoTest.class);
	
	@Autowired
	DingdanDao dingdanDao;

	@Test
	public void test() {
		Dingdan r = new Dingdan();
		r.setOrderid("test_Dingdan");
		Dingdan test_dingdan = this.dingdanDao.save(r);
		Long role_id = test_dingdan.getId();
		Dingdan result = this.dingdanDao.getOne(role_id);
		assertEquals(test_dingdan, result);
		List<Dingdan> all = this.dingdanDao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Dingdan> all size ={}", all.size()); //$NON-NLS-1$
		}
	}
	/*@Autowired
	public void setGroupDao(DingdanDao dingdanDao) {
		this.dingdanDao = dingdanDao;
		this.dao = this.dingdanDao;
	}

	@Test
	public void testGetRoot() {
		int root_size = 10;
		for (int i = 0; i < root_size; i++) {
			Dingdan dingdan = new Dingdan();
			dingdan.setOrderid("dingdan_" + i);
			for (int j = 0; j < 10; j++) {
				Dingdan g = new Dingdan();
				g.setOrderid("dingdan_" + i + "_" + j);
				g.setParent(dingdan);
			}
			this.dingdanDao.save(dingdan);
		}

		List<Dingdan> roots = this.dingdanDao.getRoot();
		assertEquals(root_size, roots.size());

		if (logger.isInfoEnabled()) {
			logger.info("testGetRoot() - List<Group> roots=" + roots); //$NON-NLS-1$
		}
	}*/

}

