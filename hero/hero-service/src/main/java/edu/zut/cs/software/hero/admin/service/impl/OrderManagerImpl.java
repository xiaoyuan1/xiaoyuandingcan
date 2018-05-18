package edu.zut.cs.software.hero.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.software.hero.admin.dao.OrderDao;
import edu.zut.cs.software.hero.admin.domain.Order;
import edu.zut.cs.software.hero.admin.service.OrderManager;
import edu.zut.cs.software.hero.base.service.impl.GenericManagerImpl;
@Component
public class OrderManagerImpl extends GenericManagerImpl<Order, Long> implements OrderManager {

	OrderDao orderDao;
	@Autowired
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
		this.dao = this.orderDao;
	}

	@Override
	public Order findbyOrdername(String ordername) {
		// TODO Auto-generated method stub
		return null;
	}

}