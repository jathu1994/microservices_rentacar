package com.jatha.rentacar.rentacarapplication.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jatha.rentacar.rentacarapplication.model.Student;
import com.jatha.rentacar.rentacarapplication.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}
	
	public Student fetchStudentById(int id) {
		Optional<Student> student =studentRepository.findById(id);
		if(student.isPresent()) {
			return student.get();
		}
		return null;
		
	}

}
