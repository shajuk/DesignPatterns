package com.designpatterns.creational.factory;

public class Shop extends Website{
	@Override
	public void createWebsite() {
		pages.add(new ProductPage());
		pages.add(new SearchPage());
		pages.add(new CartPage());
	}
}
