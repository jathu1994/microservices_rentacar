package com.jatha.rentcloud.profileservice.service;

import java.util.List;
import java.util.Optional;

import com.jatha.rentcloud.commons.model.Customer;

public interface CustomerService {
	
	Customer save(Customer customer);
	List<Customer> findAll();
	Optional<Customer> findById(int id);
//	List<Customer> findByFirstName(String firstName);
//	List<Customer> findByLastName(String lastName);
//	List<Customer> findByDlNumber(String dlNumber);
//	List<Customer> findByZipCode(String Zipcode);
	

}
