package edu.zut.cs.software.hero.admin.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.software.hero.admin.domain.Depot;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AdminServiceConfig.class)
public class DepotManagerTest {
	@Autowired
	DepotManager depotManager;
	

	@Test
	public void testFindAll() {
		List<Depot> all = this.depotManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyFootname() {
		String depotname = "world";
		Depot expected_depot = new Depot();
		Depot depot = this.depotManager.findbyDepotname(depotname);
		assertEquals(depot, expected_depot);
	}
}
