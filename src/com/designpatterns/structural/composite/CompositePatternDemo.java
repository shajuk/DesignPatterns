package com.designpatterns.structural.composite;

public class CompositePatternDemo {
	public static void main(String[] args) {
		Employee e1=new Developer("Tom", 10000);
		Employee e2=new Developer("James", 12000);
		Employee e3=new Manager("Jobs", 20000);
		e3.add(e1);
		e3.add(e2);
		Employee e4=new Developer("Ben", 17000);
		Employee gm=new Manager("Shaju", 50000);
		gm.add(e3);
		gm.add(e4);
		gm.print();
		System.out.println();
		e1.add(e4);
		
	}
}
