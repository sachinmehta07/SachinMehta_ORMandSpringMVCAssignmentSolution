package com.crm.service;

import java.util.List;


import com.crm.entity.Customer;

public interface CustomerService {

	public List<Customer> findAll();

	public Customer findById(int theId);

	public void save(Customer thecustomer);

	public void deleteById(int theId);
}
