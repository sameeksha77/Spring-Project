package com.sameeksha.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sameeksha.demo.bean.Student;

import jakarta.transaction.Transactional;


@Transactional
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	}

