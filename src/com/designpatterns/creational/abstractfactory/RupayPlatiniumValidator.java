package com.designpatterns.creational.abstractfactory;

public class RupayPlatiniumValidator implements Validator{

	@Override
	public boolean isValid(Person person) throws CreditCardException{
		if(person.getFrequencyOfBankingTransactions() < 20){
			throw new CreditCardException("You are not eligible for Credit Card as your banking useage is lesser");
		}else if( person.getFrequencyOfBankingTransactions() >= 20 && person.getFrequencyOfBankingTransactions() <=50){
			throw new CreditCardException("You are not eligible for Platinium Card instead you can request GOLD Card");
		}
		return true;
	}

}
