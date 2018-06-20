package edu.zut.cs.software.hero.depot.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.hero.depot.domain.Depot;


public class DepotDaoTest extends GenericDaoTestCase<Long, Depot, DepotDao>{

	@Autowired
	DepotDao depotDao;


	@Test
	public void test() {
		Depot r = new Depot();
		r.setRaw("test_depot");
		Depot test_role = this.depotDao.save(r);
		Long role_id = test_role.getId();
		Depot result = this.depotDao.getOne(role_id);
		assertEquals(test_role, result);
		List<Depot> all = this.depotDao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Depot> all size ={}", all.size()); //$NON-NLS-1$
		}
	}

}
