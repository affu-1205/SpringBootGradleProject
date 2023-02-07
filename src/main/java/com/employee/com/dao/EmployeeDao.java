package com.employee.com.dao;

import java.util.List;

import com.employee.com.model.Employee;

public interface EmployeeDao {

	public List<Employee> getAllEmployee();
	public Employee saveEmployee(Employee employee);
}
