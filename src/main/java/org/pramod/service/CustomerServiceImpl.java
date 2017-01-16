package org.pramod.service;

import java.util.List;

import org.pramod.dao.CustomerDao;
import org.pramod.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao; 
	
	@Override
	public String getStringTest() {
		return customerDao.getStringTest();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return customerDao.addCustomer(customer);
	}

	@Override
	public Customer updateCustomer(int id, Customer customer) {
		return customerDao.updateCustomer(id, customer);
	}

	@Override
	public Customer deleteCustomer(int id) {
		return customerDao.deleteCustomer(id);
	}

	@Override
	public Customer getCustomerById(int id) {
		return customerDao.getCustomerById(id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerDao.getAllCustomer();
	}
}
