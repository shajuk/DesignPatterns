package com.designpatterns.structural.bridge;

public class Car extends Vehicle {
	
	public Car(Manufacturer manufacturer){
		super(manufacturer);
	}
	
	public void showManufacturer() {
		manufacturer.showName();
	}
	@Override
	public void showVehicle() {
		System.out.println("Vehicle : Car");
	}
}
