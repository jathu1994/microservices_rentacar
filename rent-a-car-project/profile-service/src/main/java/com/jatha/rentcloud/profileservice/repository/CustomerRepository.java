package com.jatha.rentcloud.profileservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jatha.rentcloud.commons.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
