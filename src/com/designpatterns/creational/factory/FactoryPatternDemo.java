package com.designpatterns.creational.factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		System.out.println("Factory pattern demo");
		Products e=ProductFactory.getProducts(ProductType.ELECTRONICS);
		System.out.println(e.getItems());
		Products s=ProductFactory.getProducts(ProductType.SPORTS);
		System.out.println(s.getItems());
	}
}
