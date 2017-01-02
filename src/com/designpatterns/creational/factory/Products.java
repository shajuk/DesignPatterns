package com.designpatterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Products {
	protected List<Item> items=new ArrayList<Item>();
	public abstract void createProducts();
	public Products() {
		createProducts();
	}
	
	public List<Item> getItems(){
		return this.items;
	}
}
