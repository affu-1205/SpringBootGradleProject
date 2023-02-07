package com.employee.com.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.com.model.EmployeeVo;
import com.employee.com.service.EmployeeService;
import com.employee.com.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/task")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@GetMapping("/employee")
	public ResponseEntity<List<EmployeeVo>> getAllEmployee() {
		List<EmployeeVo> employee1 = employeeService.getAllEmployee();
		logger.info("data is getting in controller");
		
		return ResponseEntity.ok(employee1);
		
	}
	
	@PostMapping("/addemployee")
	public ResponseEntity<EmployeeVo> saveEmployeeVo(@Validated @RequestBody EmployeeVo employeevo){
		EmployeeVo employee = employeeService.saveEmployeeVo(employeevo); 
        logger.info("data is getting in controller");
		
		return ResponseEntity.status(HttpStatus.OK).body(employee);
		
	}
	
	@PostMapping("/healthcheck")
	public ResponseEntity<String> healthcheck(){
		logger.info("data is saving in db");
		return new ResponseEntity("healthcheck successful",HttpStatus.OK);
	}

}
