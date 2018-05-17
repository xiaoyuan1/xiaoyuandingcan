package edu.zut.cs.software.hero.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.software.hero.admin.domain.Order;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AdminServiceConfig.class)
public class OrderManagerTest {

	@Autowired
	OrderManager orderManager;

	@Test
	public void testFindAll() {
		List<Order> all = this.orderManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyOrdername() {
		String ordername = "world";
		Order expected_order = new Order();
		// expected_user.setUsername(username);
		Order order = this.orderManager.findbyOrdername(ordername);
		// assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(order, expected_order);
	}

}
