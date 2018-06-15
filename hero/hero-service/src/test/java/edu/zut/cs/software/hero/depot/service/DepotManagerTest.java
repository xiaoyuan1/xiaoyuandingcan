package edu.zut.cs.software.hero.depot.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import edu.zut.cs.software.hero.base.service.GenericGenerator;
import edu.zut.cs.software.hero.base.service.GenericManagerTestCase;
import edu.zut.cs.software.hero.depot.domain.Depot;
import edu.zut.cs.software.hero.user.domain.User;
import edu.zut.cs.software.hero.user.service.UserManager;


public class DepotManagerTest extends GenericManagerTestCase<Long, Depot, DepotManager>{
	DepotManager depotManager;

	public DepotManagerTest() {
		super(Depot.class);
	}

	@Autowired
	public void setDepotManager(DepotManager depotManager) {
		this.depotManager = depotManager;
		this.manager = this.depotManager;
	}

	@Before
	public void setUp() throws Exception {
		Depot user = new Depot();
		user.setRaw("价格");
		user.setCode("123");
		user.setCaipin("鱼香肉丝");
		this.entity = this.manager.save(user);
	}

	@Test
	public void testFindByFullname() {
		List<Depot> result = this.depotManager.findByFullname("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("张三", result.get(0).getEntityName());
	}

	@Test
	public void testFindByPostcode() {
		String postcode = this.entity.getCode();
		List<Depot> result = this.depotManager.findByCode(postcode);
		assertEquals(postcode, result.get(0).getCode());

	}
}
