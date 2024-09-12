package com.sameeksha.demo;

import com.sameeksha.demo.bean.Student;
import com.sameeksha.demo.repository.StudentRepository;

public class StudentService {

	private StudentRepository repository;
	private int id=100;

	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
		repository.save(new Student(id++,"Sameeksha",123456789)); // data injected in table in my sql without using query
		repository.save(new Student(id++,"Shraddha",123456789)); 
		repository.save(new Student(id++,"Vaishnavi",123456789)); 
		repository.save(new Student(id++,"Shreya",123456789)); 
	}

	public Student retriveByID(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}
}
