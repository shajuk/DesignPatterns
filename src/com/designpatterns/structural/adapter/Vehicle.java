package com.designpatterns.structural.bridge;

public abstract class Vehicle {
	
	protected Manufacturer manufacturer;
	
	public Vehicle(Manufacturer manufacturer) {
		this.manufacturer=manufacturer;
				
	}
	public abstract void showManufacturer();
	public abstract void showVehicle();
}
