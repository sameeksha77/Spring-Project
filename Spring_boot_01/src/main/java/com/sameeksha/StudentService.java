package com.sameeksha;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sameeksha.bean.Student;
import com.sameeksha.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository repository;
	private int id=100;

	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
		repository.save(new Student(id++,"Sameeksha",817491680)); // data injected in table in my SQL without using query
		repository.save(new Student(id++,"Shraddha",639358710)); 
		repository.save(new Student(id++,"Vaishnavi",873606916)); 
		repository.save(new Student(id++,"Shreya",987118263)); 
	}

	public Student retriveByID(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	public List<Student> retriveAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	

	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		repository.save(student);
	}

	public void removeByiD(int id2) {
		// TODO Auto-generated metho,d stub
		
		repository.deleteById(id2);
		
	}

	
	
	
	
	
	
	

}
