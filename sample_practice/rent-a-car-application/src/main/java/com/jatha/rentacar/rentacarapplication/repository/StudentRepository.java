package com.jatha.rentacar.rentacarapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.jatha.rentacar.rentacarapplication.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
	
	
	

}
