package com.designpatterns.creational.builder;

public class SubwayBuilderTest {

	public static void main(String[] args) {
		Subway.Builder mySubOfTheDay=new Subway.Builder();
		mySubOfTheDay.setBread("Wheat").setDressing("Honey").setMeat("Chicken");
		Subway myOrder=mySubOfTheDay.build();
		System.out.println(myOrder);
	}
}
