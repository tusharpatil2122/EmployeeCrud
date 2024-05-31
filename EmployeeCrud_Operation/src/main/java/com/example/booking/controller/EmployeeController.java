package com.example.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.booking.model.Employee;
import com.example.booking.serviceI.EmployeeServiceInterface;

@RestController
public class EmployeeController {
;
	@Autowired EmployeeServiceInterface employeeServiceInterface;
	
	@PostMapping("/postAllData")
	public String postAllData(@RequestBody Employee employee)
	{
		employeeServiceInterface.postAllEmployeeData(employee);
		return "Employee Data Added to Successfully..!!"; 
	}
}
