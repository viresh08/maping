package com.example.Mappings.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mappings.Entity.Department;
import com.example.Mappings.Entity.Students;
import com.example.Mappings.service.DepartmentService;
import com.example.Mappings.service.StudentService;

@RestController("/StuApp")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@Autowired
	private DepartmentService deptService;
	
	@GetMapping("/students")
	public List<Students> getStudents()
	{
		return service.getStudentFromService();
	}
	
	@PostMapping("/postStudents")
	public void postStudents()
	{
		 service.postStudentFromService();
	}
	
	@GetMapping("/department")
	public List<Department> getDepartment()
	{
		return deptService.getDepartmentFromService();
	}
	
	@PostMapping("/postDepartment")
	public void postDepartments()
	{
		deptService.postDepartmentFromService();
	}

}
