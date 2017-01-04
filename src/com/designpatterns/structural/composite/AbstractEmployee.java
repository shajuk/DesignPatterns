package com.designpatterns.structural.composite;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractEmployee implements Employee {
	
	protected List<Employee> employees=new ArrayList<Employee>();
	private String name;
	private long salary;

	public AbstractEmployee(String name,long salary) {
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public void add(Employee employee) {
		this.employees.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		this.employees.remove(employee);

	}

	@Override
	public Employee getChild(int i) {
		// TODO Auto-generated method stub
		return this.employees.get(i);
	}

	@Override
	public long getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	
	@Override
	public void print() {
		System.out.println();
		System.out.println("Name: "+this.name);
		System.out.println("Salary: "+this.salary);
		Iterator<Employee> employees=this.employees.iterator();
		while (employees.hasNext()) {
			Employee employee=employees.next();
			employee.print();
		}
		
	}

}
