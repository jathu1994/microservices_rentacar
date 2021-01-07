package com.jatha.rentcloud.profileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Customer save(@RequestBody Customer customer) {
		
		return customerServiceImpl.save(customer);
		
	}
	
	
	

}
