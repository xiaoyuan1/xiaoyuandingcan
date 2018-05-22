package edu.zut.cs.software.hero.order.service;

import java.util.List;


import edu.zut.cs.software.hero.base.service.GenericManager;
import edu.zut.cs.software.hero.order.domain.Order;

public interface OrderManager extends GenericManager<Order, Long> {
	List<Order> findAll();
	Order findbyOrdername(String ordername);
}
