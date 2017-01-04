package com.designpatterns.structural.composite;

public class Developer extends AbstractEmployee {

	public Developer(String name, long salary) {
		super(name, salary);
	}
	
	@Override
	public void add(Employee employee) {
		System.out.println("Leaf node: Don't have anything to add");
	}
	
	@Override
	public void remove(Employee employee) {
		System.out.println("Leaf node: Don't have anything to remove");
	}

}
