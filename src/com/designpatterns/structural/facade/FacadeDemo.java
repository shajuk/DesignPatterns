package com.designpatterns.structural.facade;


import java.util.List;

public class FacadeDemo {
	public static void main(String[] args) {
		DBFacade facade=new DBFacade();
		//Create Employee table
		facade.createTable();
		//Insert records into Employee table
		facade.insertRecords();
		//Retrieve records from Employee table
		List<Employee> employees=facade.getEmployees();
		System.out.println("Employee Details");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
