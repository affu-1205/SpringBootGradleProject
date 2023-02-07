package com.employee.com.eo;

import java.util.List;

import com.employee.com.model.Employee;

public interface EmployeeEo {

	public List<Employee> getAllEmployee();
	public Employee saveEmployee(Employee employee);

}
