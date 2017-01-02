package com.designpatterns.creational.abstractfactory;

public class CreditCardException extends Exception{

	public CreditCardException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
