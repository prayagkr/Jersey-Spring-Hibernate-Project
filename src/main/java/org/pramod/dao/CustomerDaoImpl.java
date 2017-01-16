package org.pramod.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.pramod.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public String getStringTest(){
		String save = "Got it";
		return save;
	}
	
	@Override
	public Customer addCustomer(Customer customer) {		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try{
			session.save(customer);
			tx.commit();
			return customer;
		}catch(Exception e){
			tx.rollback();
			return null;
		}
	}

	@Override
	public Customer updateCustomer(int id, Customer cust) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try{
			Customer customer = cust;
			customer.setId(id);
			session.update(customer);
			tx.commit();
			return customer;
		}catch(Exception e){
			tx.rollback();
			return null;
		}
	}

	@Override
	public Customer deleteCustomer(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try{
			Customer cust = session.get(Customer.class,id);
			session.delete(cust);
			tx.commit();
			return cust;
		}catch(Exception e){
			tx.rollback();
			return null;
		}
	}

	@Override
	public Customer getCustomerById(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try{
			Customer cust = session.get(Customer.class,id);
			tx.commit();
			session.close();
			return cust;
		}catch(Exception e){
			tx.rollback();
			session.close();
			return null;
		}		
	}

	@Override
	public List<Customer> getAllCustomer() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try{
			Query query = session.createQuery("from Customer");
			List<Customer> customers = query.list();
			tx.commit();
			session.close();
			return customers;
		}catch(Exception e){
			tx.rollback();
			session.close();
			return null;
		}		
	}

}
