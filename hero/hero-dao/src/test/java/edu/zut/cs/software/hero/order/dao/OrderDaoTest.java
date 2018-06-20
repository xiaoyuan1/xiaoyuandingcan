package edu.zut.cs.software.hero.order.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.hero.order.domain.Order;

public class OrderDaoTest extends GenericDaoTestCase<Long, Order, OrderDao> {
	@Autowired
	OrderDao orderDao;
	@Test
	public void test() {
		Order r = new Order();
		r.setOrder_Acost("test_order");
		Order test_role = this.orderDao.save(r);
		Long role_id = test_role.getId();
		Order result = this.orderDao.getOne(role_id);
		assertEquals(test_role, result);
		List<Order> all = this.orderDao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Order> all size ={}", all.size()); //$NON-NLS-1$
		}
	}
	
}