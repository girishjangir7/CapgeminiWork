package com.cg.billing.daoservices;

import java.util.List;

import com.cg.billing.beans.Customer;


public interface CustomerDao {
	Customer save(Customer customer);
	Customer findOne(int customerId);
	List <Customer> findAll();
	boolean update(Customer customer);
}
