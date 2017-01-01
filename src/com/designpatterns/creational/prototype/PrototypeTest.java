package com.designpatterns.creational.prototype;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class PrototypeTest {
	
	public static void main(String[] args) {
		Registry itemRegistry=new Registry();
		Movie movie1=(Movie)itemRegistry.createItem(ItemType.MOVIE);
		movie1.setName("Sulthan");
		movie1.setPrice(new BigDecimal(100));
		movie1.setRuntime("2.5 Hours");
		
		Movie movie2=(Movie)itemRegistry.createItem(ItemType.MOVIE);
		movie1.setName("Two States");
		movie1.setPrice(new BigDecimal(50));
		movie1.setRuntime("2 Hours");
		


		System.out.println(movie1.equals(movie2));
		System.out.println();
		
		VehicleRegistry vReg=new VehicleRegistry();
		Car c=(Car)vReg.registerVehicle(ItemType.CAR);
		c.setBrandName("Swift");
		c.setPrice(500000);
		Car c1=(Car)vReg.registerVehicle(ItemType.CAR);
		c1.setBrandName("Hundayi");
		c1.setPrice(400000);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c==c1);
		NumberFormat x;
		
	}

}
