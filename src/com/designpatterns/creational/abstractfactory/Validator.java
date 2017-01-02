package com.designpatterns.creational.abstractfactory;

public interface Validator {
	public boolean isValid(Person person) throws CreditCardException;
}
