package com.employee.com.model;



import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;



public class EmployeeVo {
	
	@NotNull
	@Min(value=3,message="criteria not met")
	private int employeeId;
	
	@NotNull
	@Max(value=30,message="criteria not met")
	private String employeeName;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public EmployeeVo(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public EmployeeVo() {
		super();
	}
	
	

}
