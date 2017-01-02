package com.designpatterns.creational.prototype;

public class Employee implements Cloneable {
	
	private String employeeId;
	private String name;
	private String dateJoining;
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateJoining() {
		return dateJoining;
	}

	public void setDateJoining(String dateJoining) {
		this.dateJoining = dateJoining;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
