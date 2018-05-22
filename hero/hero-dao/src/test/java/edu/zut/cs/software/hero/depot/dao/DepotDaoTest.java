package edu.zut.cs.software.hero.depot.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.depot.domain.Depot;


public class DepotDaoTest {

	@Autowired
	DepotDao depotDao;

	@Test
	public void test() {
		Depot r = new Depot();
		r.setRaw("test_Dingdan");
		Depot test_dingdan = this.depotDao.save(r);
		Long role_id = test_dingdan.getId();
		Depot result = this.depotDao.getOne(role_id);
		assertEquals(test_dingdan, result);
		List<Depot> all = this.depotDao.findAll();
	}

}
