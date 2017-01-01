package com.designpatterns.creational.builder;

public class LunchOrderTest {

	public static void main(String[] args) {
		LunchOrder.Builder lunchOrderBuilder=new LunchOrder.Builder();
		lunchOrderBuilder.setBread("Wheat").setDressing("Honey").setMeat("Chicken");
		LunchOrder lunchOrder=lunchOrderBuilder.build();
		System.out.println(lunchOrder);
	}
}
