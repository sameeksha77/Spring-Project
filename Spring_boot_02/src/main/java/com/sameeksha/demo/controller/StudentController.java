package com.sameeksha.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sameeksha.demo.StudentService;
import com.sameeksha.demo.bean.Student;


@RestController
public class StudentController {

	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}



	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.retriveByID(id);
	}

}
