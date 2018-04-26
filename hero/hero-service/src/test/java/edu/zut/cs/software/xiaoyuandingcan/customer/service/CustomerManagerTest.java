package edu.zut.cs.software.xiaoyuandingcan.customer.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.software.hero.user.ServiceConfig;
import edu.zut.cs.software.xiaoyuandiancan.customer.domain.Customer;
import edu.zut.cs.software.xiaoyuandingcan.customer.service.impl.CustomerManagerimpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ServiceConfig.class)
public class CustomerManagerTest {
	
	//CustomerManager customerManager= new CustomerManagerimpl();
	@Autowired
	CustomerManager customerManager;

	@Test
	public void testFindByLastName() {
		String lastName="world";
		List<Customer> result=this.customerManager.findByLastName(lastName);
	}

}
