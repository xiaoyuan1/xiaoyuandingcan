package edu.zut.cs.software.hero.order.service;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.order.domain.Order;

import edu.zut.cs.software.hero.base.service.GenericGenerator;

public class OrderManagerTest extends GenericGenerator{

	@Autowired
	OrderManager orderManager;

	@Test
	public void gen_order() {
		for (int i = 0; i < 10; i++) {
			Order g = new Order();
			g.setOrder_Anumber("group_" + i);
			this.orderManager.save(g);
			for (int j = 0; j < 10; j++) {
            Order group = new Order();
			group.setOrder_Anumber("group_" + i + "_" + j);
			g = this.orderManager.save(group);
			}
		}
	}

}
