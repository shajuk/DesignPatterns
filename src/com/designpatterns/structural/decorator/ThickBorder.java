package com.designpatterns.structural.decorator;

public class ThickBorder implements Border {

	@Override
	public void applyBorder() {
		System.out.println("Choosing thick border");
	}

}
