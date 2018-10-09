package com.capgemini.Customer.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Customer.entity.Customer;
import com.capgemini.Customer.repository.CustomerRepository;
import com.capgemini.Customer.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer){
		
		return customerRepository.save(customer);
	}
	
	@Override
	public Customer authenticate(int customerId, String customerPassword) {
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
				return optionalCustomer.get();
	}

	@Override
	public Customer updateProfile(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer findCustomerById(int customerId) {
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
			return optionalCustomer.get();
		
	}

	@Override
	public void deleteCustomer(int customerId) {
		customerRepository.deleteById(customerId);
	}

}
