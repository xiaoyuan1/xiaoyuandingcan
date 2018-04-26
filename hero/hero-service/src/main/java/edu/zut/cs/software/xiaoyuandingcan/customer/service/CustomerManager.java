package edu.zut.cs.software.xiaoyuandingcan.customer.service;

import java.util.List;

import edu.zut.cs.software.xiaoyuandiancan.customer.domain.Customer;

public interface CustomerManager {

	List<Customer> findByLastName(String lastName);
}
