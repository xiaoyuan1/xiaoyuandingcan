package edu.zut.cs.software.hero.Foot.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.Foot.domain.Foot;
import edu.zut.cs.software.hero.base.dao.GenericDaoTestCase;

public class FootDaoTest extends GenericDaoTestCase<Long, Foot, FootDao> {

	@Autowired
	FootDao footDao;

	@Test
	public void test() {
		Foot r = new Foot();
		r.setProduct_name("test_role");
		Foot test_role = this.footDao.save(r);
		Long role_id = test_role.getId();
		Foot result = this.footDao.getOne(role_id);
		assertEquals(test_role, result);
		List<Foot> all = this.footDao.findAll();
	}
}
