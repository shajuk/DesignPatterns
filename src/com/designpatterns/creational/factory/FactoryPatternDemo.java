package com.designpatterns.creational.factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		Products e=ProductFactory.getProducts(ProductType.ELECTRONICS);
		System.out.println(e.getItems());
		Products s=ProductFactory.getProducts(ProductType.SPORTS);
		System.out.println(s.getItems());
	}
}
