package com.sameeksha.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sameeksha.demo.bean.Student;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String helloWorld() {
		return "This is My First Web Application";
	}
	
	@RequestMapping("/student")
	public Student getStudent() {
		return new Student(101,"Sameeksha Gupta", 817491680) ;
	}

}
