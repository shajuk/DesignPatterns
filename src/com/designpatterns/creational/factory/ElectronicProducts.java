package com.designpatterns.creational.factory;

public class ElectronicProducts extends Products {

	@Override
	public void createProducts() {
		items.add(new Television());
		items.add(new Tubelights());
	}

}
