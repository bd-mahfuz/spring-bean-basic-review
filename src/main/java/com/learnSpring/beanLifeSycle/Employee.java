package com.learnSpring.beanLifeSycle;

public class Employee {

	private String empName;
	private String empId;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	
	public void beforeInit() {
		System.out.println("calling befor initialization");
	}
	
	public void beforeDestroy() {
		System.out.println("calling befor Destroy");
	}
	
}