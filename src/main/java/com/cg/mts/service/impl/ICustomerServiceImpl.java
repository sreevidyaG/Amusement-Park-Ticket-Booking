package com.cg.mts.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Customer;
import com.cg.mts.repository.ICustomerRepository;
import com.cg.mts.service.ICustomerService;

@Service
public class ICustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepository iCustomerRepository;

	@Override
	public Customer insertCustomer(Customer customer) {

		Customer cust = iCustomerRepository.save(customer);
		return cust;
	}

	@Override
	public Customer updateCustomer(Customer customer) {

		Customer cust = iCustomerRepository.save(customer);
		return cust;
	}

	@Override
	public Customer deleteCustomer(Long customerId) {
		Optional<Customer> cust = iCustomerRepository.findById(customerId);
		if (cust.isPresent()) {
			iCustomerRepository.deleteById(customerId);
			return cust.get();
		}
		return null;
	}

	@Override
	public List<Customer> viewCustomers() {
		List<Customer> cust = iCustomerRepository.findAll();
		return cust;
	}

	@Override
	public Customer viewCustomer(Long customerId) {
		Optional<Customer> cust = iCustomerRepository.findById(customerId);
		if (cust.isPresent()) {
			return cust.get();
		}
		return null;
	}

	@Override
	public Customer validateCustomer(String username, String password) {
		Customer cust = iCustomerRepository.findByUsernameAndPassword(username,password);
		return cust;
	}

}
