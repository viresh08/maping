package com.example.Mappings.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Mappings.Entity.Students;

import jakarta.persistence.Entity;

@Repository
public interface StudentRepository extends JpaRepository<Students, Integer>{
	
	

}
