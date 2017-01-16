package org.pramod.service;

import java.util.List;

import org.pramod.model.Customer;

public interface CustomerService {

	String getStringTest();
	Customer addCustomer(Customer customer);
	Customer updateCustomer(int id, Customer customer);
	Customer deleteCustomer(int id);
	Customer getCustomerById(int id);
	List<Customer> getAllCustomer();
}
