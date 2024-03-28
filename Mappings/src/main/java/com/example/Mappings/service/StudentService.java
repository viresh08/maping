package com.example.Mappings.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mappings.Entity.Department;
import com.example.Mappings.Entity.Students;
import com.example.Mappings.repo.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public List<Students> getStudentFromService()
	{
		List<Students> studentsFromDB =  repository.findAll();
		return studentsFromDB;
	}
	
	
	public void postStudentFromService() 
	{
		Students studentOne = new Students();
		studentOne.setId(301);
		studentOne.setfName("Viresh");
		studentOne.setlName("Dev");
		studentOne.setEmail("abc@abc");
		
		Department departmentOne = new Department();
		departmentOne.setDepartment_Id(301); 
		departmentOne.setDepartmentName("Machine Learning");
		//departmentOne.setDepartStudentId(301);
		Set<Department> departmentSet = new HashSet<>();
		departmentSet.add(null);
		
		//studentOne.setDepartments(departmentSet);
		
		
		
		
		repository.save(studentOne);
		
	}
}
