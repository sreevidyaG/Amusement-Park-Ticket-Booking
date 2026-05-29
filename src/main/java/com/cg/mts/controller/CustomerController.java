package com.cg.mts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.Customer;
import com.cg.mts.service.ICustomerService;

@RestController
@RequestMapping("/amusement/park/customer")
public class CustomerController {

	@Autowired
	private ICustomerService iCustomerService;

	@GetMapping("/view")
	public ResponseEntity<List<Customer>> viewCustomers() {
		return new ResponseEntity<>(iCustomerService.viewCustomers(), HttpStatus.OK);
	}

	@GetMapping("/view/{customerId}")
	public ResponseEntity<Customer> viewCustomer(@PathVariable Long customerId) {
		return new ResponseEntity<>(iCustomerService.viewCustomer(customerId), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
		return new ResponseEntity<>(iCustomerService.updateCustomer(customer), HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Customer> insertCustomer(@RequestBody Customer customer) {
		return new ResponseEntity<>(iCustomerService.insertCustomer(customer), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{customerId}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable Long customerId) {
		return new ResponseEntity<>(iCustomerService.deleteCustomer(customerId), HttpStatus.OK);
	}

	@PostMapping("/validate")
	public ResponseEntity<Customer> validateCustomer(String username, String password) {
		return new ResponseEntity<>(iCustomerService.validateCustomer(username, password), HttpStatus.OK);
	}

}
