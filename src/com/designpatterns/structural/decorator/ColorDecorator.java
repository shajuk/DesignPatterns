package com.designpatterns.structural.decorator;

public class ColorDecorator extends ShapeDecorator{

	private Color color;
	
	public ColorDecorator(Shape shape,Color color) {
		super(shape);
		this.color=color;
	}
	
	@Override
	public void draw() {
		color.applyColor();
		super.draw();
		
	}
	
}
