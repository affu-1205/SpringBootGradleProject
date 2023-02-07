package com.employee.com.bo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.com.eo.EmployeeEo;
import com.employee.com.exception.TableNotFoundException;
import com.employee.com.model.Employee;
import com.employee.com.model.HealthCheck;

@Service("employeeBo")
public class EmployeeBoImpl implements EmployeeBo {
	
	@Autowired
	private EmployeeEo employeeEo;
	
	Logger logger = LoggerFactory.getLogger(EmployeeBoImpl.class);

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		logger.info("getting data in Bo");
		return employeeEo.getAllEmployee();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		logger.info("saving data in Bo");
		return employeeEo.saveEmployee(employee);
	}

	@Override
	public HealthCheck healthcheck() throws TableNotFoundException{
		// TODO Auto-generated method stub
		HealthCheck healthcheck = new HealthCheck();
		healthcheck.setHealthComment("check table is available in db");
		try {
			if(getAllEmployee() != null) {
				healthcheck.setHealthStatus("success");
				healthcheck.setHealthDescription("table is avaliable");
			}
		}
		catch(Exception ex) {
			healthcheck.setHealthStatus("failure");
			healthcheck.setHealthDescription("table is not available");
			
		}
		return healthcheck;
	}

}
