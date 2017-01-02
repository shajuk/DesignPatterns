package com.designpatterns.creational.factory;

public class SportsProducts extends Products {

	public void createProducts() {
		items.add(new Bats());
		items.add(new BasketBall());
		items.add(new Football());
	}

}
