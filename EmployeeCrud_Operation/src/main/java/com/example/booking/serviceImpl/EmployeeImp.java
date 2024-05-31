package com.example.booking.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.booking.model.Employee;
import com.example.booking.repository.EmployeeRepository;
import com.example.booking.serviceI.EmployeeServiceInterface;

@Service
public class EmployeeImp implements EmployeeServiceInterface{

	@Autowired 
	EmployeeRepository employeRepository;

	@Override
	public void postAllEmployeeData(Employee employee) {
		
		employeRepository.save(employee);
	}
}
