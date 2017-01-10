package com.designpatterns.structural.decorator;

public class Red implements Color {

	@Override
	public void applyColor() {
		System.out.println("Choosing Red color");
	}

}
