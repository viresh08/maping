package com.example.Mappings.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Mappings.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
