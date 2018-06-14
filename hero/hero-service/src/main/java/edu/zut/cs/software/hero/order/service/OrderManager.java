package edu.zut.cs.software.hero.order.service;

import java.util.List;


import edu.zut.cs.software.hero.base.service.GenericManager;
import edu.zut.cs.software.hero.order.domain.Order;


public interface OrderManager extends GenericManager<Order, Long> {
	/**
	 * get student list by given code
	 *
	 * @param code
	 * @return
	 */
	List<Order> findByCode(String code);

	/**
	 * 
	 * @param fullname
	 * @return
	 */
	List<Order> findByFullname(String fullname);
}
