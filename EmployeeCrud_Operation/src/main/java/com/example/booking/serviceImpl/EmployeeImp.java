package com.example.booking.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.booking.model.Employee;
import com.example.booking.repository.EmployeeRepository;
import com.example.booking.serviceI.EmployeeServiceInterface;

@Service
public class EmployeeImp implements EmployeeServiceInterface {

	@Autowired
	EmployeeRepository employeRepository;

	@Override
	public void postAllEmployeeData(List<Employee> employee) {

		employeRepository.saveAll(employee);
	}

	@Override
	public Iterable<Employee> getAllData() {

		return employeRepository.findAll();
	}

	@Override
	public Optional<Employee> getSingleRecord(int emp_id) {

		Optional<Employee> byId = employeRepository.findById(emp_id);

		return employeRepository.findById(emp_id);
	}

	@Override
	public void updateSingleRecord(int emp_id, Employee employee) {

		employee.setEmp_id(emp_id);
		employeRepository.save(employee);
	}

	@Override
	public void deleteSingleRecord(int emp_id) {

		employeRepository.deleteById(emp_id);
	}

	@Override
	public void updateMultipleRecords(List<Employee> employees) {
		// TODO Auto-generated method stub
		
	}

}
