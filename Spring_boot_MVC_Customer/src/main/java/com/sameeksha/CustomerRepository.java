package com.sameeksha;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}

