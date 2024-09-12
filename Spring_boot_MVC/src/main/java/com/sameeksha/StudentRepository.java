package com.sameeksha;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;


@Transactional
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
