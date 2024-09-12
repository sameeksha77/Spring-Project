package com.sameeksha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sameeksha.bean.Student;

import jakarta.transaction.Transactional;


@Transactional
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
