package edu.zut.cs.software.depot;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.software.depot.domain.Depot;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ServiceConfig.class)
public class DepotManagerTest {
	@Autowired
	DepotManager depotManager;
	

	@Test
	public void test() {
		String raw="liangcai";
		List<Depot> result=this.depotManager.findByRaw(raw);
	}

}
