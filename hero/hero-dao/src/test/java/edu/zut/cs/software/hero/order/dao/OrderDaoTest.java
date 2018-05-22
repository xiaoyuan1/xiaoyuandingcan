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
		o.setAddress("test_address");
		Order test_address=this.orderDao.save(o);
		o.setCustomer("test_customer");
		Order test_customer=this.orderDao.save(o);
		o.setFood_name("test_food_name"); 
		Order test_food_name=this.orderDao.save(o);
		o.setFood_number("test_food_number");
		Order test_food_number=this.orderDao.save(o);
		o.setFood_price("test_food_price");
		Order test_food_price=this.orderDao.save(o);
		List<Order> all = this.orderDao.findAll();
	}
	
}