package com.capgemini.Customer.service;

import com.capgemini.Customer.entity.Customer;

public interface CustomerService {
	public Customer addCustomer(Customer customer);

	public Customer authenticate(int customerId, String customerPassword);

	public Customer updateProfile(Customer customer);

	public Customer findCustomerById(int customerId);

	public void deleteCustomer(int customerId);

}
