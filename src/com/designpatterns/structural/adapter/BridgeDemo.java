package com.designpatterns.structural.bridge;

public class BridgeDemo {
	public static void main(String[] args) {
		Manufacturer maruthi=new Maruthi();
		Vehicle v1=new Car(maruthi);
		v1.showManufacturer();
		v1.showVehicle();
		
		Manufacturer tata=new Tata();
		Vehicle v2=new Car(tata);
		v2.showManufacturer();
		v2.showVehicle();
		
		Vehicle v3=new Truck(tata);
		v3.showManufacturer();
		v3.showVehicle();
	}
}
