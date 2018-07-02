package edu.zut.cs.software.hero.order.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.order.domain.Order;
import edu.zut.cs.software.hero.base.service.GenericManagerTestCase;

public class OrderManagerTest extends  GenericManagerTestCase<Long, Order, OrderManager>{


//	@Test
//	public void gen_order() {
//		for (int i = 0; i < 10; i++) {
//			Order g = new Order();
//			g.setOrder_Anumber("group_" + i);
//			this.orderManager.save(g);
//			for (int j = 0; j < 10; j++) {
//            Order group = new Order();
//			group.setOrder_Anumber("group_" + i + "_" + j);
//			g = this.orderManager.save(group);
//			}
//		}
//	}

	OrderManager orderManager;

	public OrderManagerTest() {
		super(Order.class);
	}

	@Autowired
	public void setOrderManager(OrderManager orderManager) {
		this.orderManager = orderManager;
		this.manager = this.orderManager;
	}

	@Before
	public void setUp() throws Exception {
		Order user = new Order();
		user.setOrder_Acost("100");
		user.setOrder_Aprice("100");
		user.setOrder_Aprofit("100");
		user.setorder_Adiscount("100");
		user.setorder_Aintegral("100");
		this.entity = this.manager.save(user);
	}

	@Test
	public void testFindByFullname() {
		List<Order> result = this.orderManager.findByFullname(null);
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals(null, result.get(0).getEntityName());
	}

	@Test
	public void testFindByPostcode() {
		String postcode = this.entity.getCode();
		List<Order> result = this.orderManager.findByCode(postcode);
		assertEquals(postcode, result.get(0).getCode());

	}

}
