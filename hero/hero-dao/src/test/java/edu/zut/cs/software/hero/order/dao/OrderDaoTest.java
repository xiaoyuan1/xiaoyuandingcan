package edu.zut.cs.software.hero.order.dao;

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
		Order o=new Order();
		o.setOrder_Aprice("test_order_Aprice");
		Order test_order_Aprice=this.orderDao.save(o);
		o.setOrder_Acost("test_order_Acost");
		Order test_order_Acost=this.orderDao.save(o);
		o.setOrder_Aprofit("test_order_Aprofit");
		Order test_order_Aprofit=this.orderDao.save(o);
		List<Order> all = this.orderDao.findAll();
	}
	
}