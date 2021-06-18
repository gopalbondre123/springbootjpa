package com.gopalsoft.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Employee")  // usable for JPQL query
@Table(name = "employee")
public class Employee {
	@Id	
	//@GeneratedValue(strategy=GenerationType.IDENTITY)   //AUTO,IDENTITY,SEQUENCE,TABLE
	//if not using generator ,then manually need to send
	@Column(name="empid",updatable=false,nullable=false)
	private Integer empId;
	@Column(name = "empname")
	private String empName;
	@Column(name = "empsal")
	private Double empSal;
	@Column(name = "empdept")
	private String empDept;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDept=" + empDept
				+ "]";
	}
}
