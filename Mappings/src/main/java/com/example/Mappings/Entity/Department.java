package com.example.Mappings.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Department {
	
	@Column(name="DEPT_NAME")
	private String departmentName;
	
	/*
	 * @Column(name="DEPART_STUDENT_ID") private String deptStudent;
	 */
	
	
	
	
	
	  
	  @ManyToOne
	  @JoinColumn(name="DEPART_STUDENT_ID")
	  @JsonIgnoreProperties("departments")
	  private Students students;
	  
	  public Students getStudents() { return students; }
	  
	  public void setStudents(Students students) { this.students = students; }
	 

		/*
		 * public String getDeptStudent() { return deptStudent; }
		 * 
		 * public void setDeptStudent(String deptStudent) { this.deptStudent =
		 * deptStudent; }
		 */

	@Id
	private Integer department_Id;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getDepartment_Id() {
		return department_Id;
	}

	public void setDepartment_Id(Integer department_Id) {
		this.department_Id = department_Id;
	}
	
	
	
	

}
