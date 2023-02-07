package com.employee.com.service;

import java.util.List;

import com.employee.com.model.EmployeeVo;
import com.employee.com.model.HealthCheck;

public interface EmployeeService {

	public List<EmployeeVo> getAllEmployee();

	public EmployeeVo saveEmployeeVo(EmployeeVo employeevo);

	public HealthCheck healthcheck();

}
