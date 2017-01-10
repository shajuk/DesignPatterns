package com.designpatterns.structural.decorator;

public class BorderDecorator extends ShapeDecorator {
	
	private Border border;
	
	public BorderDecorator(Shape shape,Border border) {
		super(shape);
		this.border=border;
	}

	@Override
	public void draw() {
		border.applyBorder();
		super.draw();
	}

}
