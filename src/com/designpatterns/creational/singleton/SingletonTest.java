package com.designpatterns.creational.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton object1= Singleton.getInstance();
		System.out.println(object1);
		Singleton object2= Singleton.getInstance();
		System.out.println(object2);
		System.out.println("Is object reference "+object1+" and object reference "+object2+" same ? "+": "+(object1 == object2));
	}

}
