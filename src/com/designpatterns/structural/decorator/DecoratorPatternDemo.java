package com.designpatterns.structural.decorator;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		Circle c=new Circle();
		Border border=new ThickBorder();
		Color red=new Red();
		ShapeDecorator circleDecorator=new BorderDecorator(new ColorDecorator(c, red), border);
		circleDecorator.draw();
		
		ShapeDecorator rectangleDecorator=new BorderDecorator(new ColorDecorator(new Rectangle(), red), border);
		rectangleDecorator.draw();
	}

}
