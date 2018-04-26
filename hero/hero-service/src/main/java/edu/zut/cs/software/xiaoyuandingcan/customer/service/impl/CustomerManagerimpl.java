package edu.zut.cs.software.xiaoyuandingcan.customer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import edu.zut.cs.software.xiaoyuandiancan.customer.domain.Customer;
import edu.zut.cs.software.xiaoyuandingcan.customer.service.CustomerManager;

@Component
public class CustomerManagerimpl implements CustomerManager {
	

	@Override
	public List<Customer> findByLastName(String lastName) {
		List<Customer> all=new ArrayList<Customer>();
		return all;
	}

}
