package com.capgemini.Customer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.Customer.entity.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {
	
}
