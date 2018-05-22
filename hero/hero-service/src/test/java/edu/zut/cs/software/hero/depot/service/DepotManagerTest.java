package edu.zut.cs.software.hero.depot.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import edu.zut.cs.software.hero.base.service.GenericGenerator;
import edu.zut.cs.software.hero.depot.domain.Depot;


public class DepotManagerTest extends GenericGenerator{
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
