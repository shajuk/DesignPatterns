package com.designpatterns.creational.prototype;

import java.math.BigDecimal;

public abstract class Item implements Cloneable{
	
	private BigDecimal price;
	private String name;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
