package edu.zut.cs.software.hero.admin.service;

import java.util.List;


import edu.zut.cs.software.hero.admin.domain.Order;
import edu.zut.cs.software.hero.base.service.GenericManager;

public interface OrderManager extends GenericManager<Order, Long> {
	List<Order> findAll();
	Order findbyOrdername(String ordername);
}
