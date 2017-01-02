package com.designpatterns.creational.abstractfactory;

public abstract class CreditCard {
	protected int cvvNumber;
	protected int cardNumberLength;
	
	public int getCvvNumber() {
		return cvvNumber;
	}
	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
	public int getCardNumberLength() {
		return cardNumberLength;
	}
	public void setCardNumberLength(int cardNumberLength) {
		this.cardNumberLength = cardNumberLength;
	}
	
}
