package com.gopalsoft.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gopalsoft.application.model.Employee;
import com.gopalsoft.application.service.IEmployeeService;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins="http://localhost:3000")
public class EmployeeRestController {
@Autowired
private IEmployeeService employeeService;

  @PostMapping("/")
  public ResponseEntity<String>  saveEmployee(@RequestBody Employee employee){
	  
	  
	  Integer empId=employeeService.saveEmployee(employee);
	  
	  return new ResponseEntity<String>("Employee ID '"+empId+"' is saved successfully",HttpStatus.OK);
	  
	  
  }

  
  @GetMapping("/")
  public ResponseEntity<List<Employee>>  getAllEmployees(){
	  System.out.println("get all employees");
	  
	  List<Employee> empList=employeeService.getAllEmployees();
	  
	  return new  ResponseEntity<List<Employee>>(empList,HttpStatus.OK);
	  
	  
  }
  
  
  @GetMapping("/{empid}")
  public ResponseEntity<Employee>  getOneEmployee(@PathVariable Integer empid){
	  
	  System.out.println("get one employees");
	  Employee emp=employeeService.getOneEmployee(empid);
	  System.out.println(emp);
	  return new  ResponseEntity<Employee>(emp,HttpStatus.OK);
	  
	  
  }
  
  
  @DeleteMapping("/{empid}")
  public ResponseEntity<String>  deleteOneEmployee(@PathVariable Integer empid){
	  
	  
	  employeeService.deleteOneEmployee(empid);
	  
	  return new  ResponseEntity<String>("Employee ID '"+empid+"' is deleted",HttpStatus.OK);
	  
	  
  }

}
