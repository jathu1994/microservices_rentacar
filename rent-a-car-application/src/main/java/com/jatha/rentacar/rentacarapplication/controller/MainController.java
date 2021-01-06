package com.jatha.rentacar.rentacarapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jatha.rentacar.rentacarapplication.model.Student;
import com.jatha.rentacar.rentacarapplication.service.StudentService;
import com.jatha.rentacar.rentacarapplication.service.StudentServiceImpl;

@RestController
public class MainController {
	
	@Autowired
	StudentServiceImpl studentService;
	
	@GetMapping("/hello")
	public String greeting() {
		return "Hello we are ready";
	}
	
	@PostMapping("/hello")
	public String greeting2() {
		return "Hello we are ready fro post";
	}
	
	@RequestMapping(value = "/student",method = RequestMethod.POST)
	public Student save(@RequestBody Student student) {
		return studentService.save(student);
		
	}
	
	@RequestMapping(value = "/student" ,method = RequestMethod.GET)
	public ResponseEntity<Student> fetchStudent(@RequestParam int id) {
		Student student = studentService.fetchStudentById(id);
		if(student==null) {
			return ResponseEntity.notFound().build();
			
			
		}else {
			return ResponseEntity.ok().body(student);
		}
		 
	}
	
	

}
