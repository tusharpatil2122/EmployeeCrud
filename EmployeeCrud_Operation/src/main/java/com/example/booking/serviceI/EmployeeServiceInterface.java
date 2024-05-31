package com.example.booking.serviceI;

import java.util.List;
import java.util.Optional;

import com.example.booking.model.Employee;

public interface EmployeeServiceInterface {

	void postAllEmployeeData(List<Employee> employee);

	Iterable<Employee> getAllData();

	Optional<Employee> getSingleRecord(int emp_id);
	
    void updateSingleRecord(int emp_id, Employee employee);

	void deleteSingleRecord(int emp_id);

	void updateMultipleRecords(List<Employee> employees);

	
}
