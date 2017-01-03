package com.designpatterns.structural.bridge;

public class Truck extends Vehicle {

	public Truck(Manufacturer manufacturer) {
		super(manufacturer);
	}
	
	@Override
	public void showManufacturer() {
		manufacturer.showName();
	}

	@Override
	public void showVehicle() {
		System.out.println("Vehicle: Truck");
	}

}
