package com.cg.mts.service;

import java.util.List;

import com.cg.mts.entities.Customer;

public interface ICustomerService {

	public Customer insertCustomer(Customer customer);

	public Customer updateCustomer(Customer customer);

	public Customer deleteCustomer(Long customer);

	public List<Customer> viewCustomers();

	public Customer viewCustomer(Long customerId);

	public Customer validateCustomer(String username, String password);
}