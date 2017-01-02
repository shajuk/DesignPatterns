package com.designpatterns.creational.abstractfactory;

public class MasteroGoldValidator implements Validator{

	@Override
	public boolean isValid(Person person) throws CreditCardException {
		if(person.getFrequencyOfBankingTransactions()<20){
			throw new CreditCardException("You are not eligible for Credit Card as your banking useage is lesser");
		}
		if(person.getCardTypeRequested() == CardType.GOLD 
				&& person.getFrequencyOfBankingTransactions() >= 20 && person.getFrequencyOfBankingTransactions() <=50){
			return true;
		}
		return false;
	}

}
