package com.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
	
	private Map<ItemType,Vehicle> vehicles=new HashMap<ItemType,Vehicle>();
	
	public VehicleRegistry() {
		createVehicleTemplate();
	}
	
	public Vehicle registerVehicle(ItemType type){
		Car c=null;
		try {
			c=(Car)((Car)vehicles.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return c;
	}
	
	private void createVehicleTemplate(){
		Car c=new Car();
		c.setBrandName("");
		c.setPrice(0);
		vehicles.put(ItemType.CAR, c);
	}
}
