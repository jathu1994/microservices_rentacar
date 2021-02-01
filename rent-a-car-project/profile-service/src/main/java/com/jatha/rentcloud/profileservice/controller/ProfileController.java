package com.jatha.rentcloud.profileservice.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jatha.rentcloud.commons.model.Customer;
import com.jatha.rentcloud.profileservice.service.CustomerServiceImpl;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {
	
	@Autowired 
	CustomerServiceImpl customerServiceImpl;
	
	
	@RequestMapping(value = "/profile",method = RequestMethod.POST)
	@PreAuthorize("hasAuthority('create_profile')")
	public Customer save(@RequestBody Customer customer) {
		
		return customerServiceImpl.save(customer);
		
	}
	
	@RequestMapping(value = "/profile",method = RequestMethod.GET)
	@PreAuthorize("hasAuthority('read_profile')")
	public List<Customer> findAll() {
		
		return customerServiceImpl.findAll();
		
	}
	
	@RequestMapping(value = "/profile/{id}",method = RequestMethod.GET)
	public Optional<Customer> findById(@PathVariable(value="id") int id) {
		
		return customerServiceImpl.findById(id);
		
	}
	
	
	

}
