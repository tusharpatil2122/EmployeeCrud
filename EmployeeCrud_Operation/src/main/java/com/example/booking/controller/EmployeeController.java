package com.example.booking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.booking.model.Employee;
import com.example.booking.serviceI.EmployeeServiceInterface;

@RestController
public class EmployeeController {
	;
	@Autowired
	EmployeeServiceInterface employeeServiceInterface;

	@PostMapping("/postAllData")
	public String postAllData(@RequestBody List<Employee> employee) {
		employeeServiceInterface.postAllEmployeeData(employee);
		return "Employee Data Added to Successfully..!!";
	}

	@GetMapping("/getAllData")
	public Iterable<Employee> getAllData() {
		return employeeServiceInterface.getAllData();
	}

	@GetMapping("/getSingleData/{emp_id}")
	public Optional<Employee> getSingleData(@PathVariable int emp_id) {
		return employeeServiceInterface.getSingleRecord(emp_id);
	}

	@PutMapping("/updateSingleData/{emp_id}")
	public String updateSingleData(@PathVariable int emp_id, @RequestBody Employee employee) {
		employeeServiceInterface.updateSingleRecord(emp_id, employee);
		return "Updated Employee [ID: " + emp_id + "] Successfully..!!";
	}
	
	
	@PutMapping("/updateMultipleData")
	public String updateMultipleData(@RequestBody List<Employee> employees)
	{
		employeeServiceInterface.updateMultipleRecords(employees);
		 return "Updated Multiple Employees Successfully..!!";
	}

	@DeleteMapping("/deleteSingleData/{emp_id}")
	public String deleteSingleData(@PathVariable int emp_id)
	{
		employeeServiceInterface.deleteSingleRecord(emp_id);
		return "Deleted Employee [ID: " + emp_id + "] Successfully..!!";
	}
	
	
	
	
	

}
