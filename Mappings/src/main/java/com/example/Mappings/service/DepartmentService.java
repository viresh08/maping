package com.example.Mappings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mappings.Entity.Department;
import com.example.Mappings.Entity.Students;
import com.example.Mappings.repo.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository deptRepo;
	
	public List<Department> getDepartmentFromService()
	{
		List<Department> departmentFromDB =  deptRepo.findAll();
		return departmentFromDB;
	}
	
	
	public void postDepartmentFromService()
	{
		Department departmentOne = new Department();
		departmentOne.setDepartment_Id(301);
		departmentOne.setDepartmentName("AI"); 
		Students studentOne = new Students();
		studentOne.setId(301);
		studentOne.setfName("Dev1");
		studentOne.setlName("Dev2");
		studentOne.setEmail("xyz@xyz");
	//	departmentOne.setStudents(studentOne);
		
		deptRepo.save(departmentOne);
		
	}

}
