package com.employee.com.bo;

import java.util.List;

import com.employee.com.model.Employee;
import com.employee.com.model.HealthCheck;

public interface EmployeeBo {
	
	public List<Employee> getAllEmployee();
	public Employee saveEmployee(Employee employee);
	public HealthCheck healthcheck();

}
