package com.designpatterns.creational.abstractfactory;

public abstract class CreditCardFactory {
	
	public abstract CreditCard getCreditCard(CardType type);
	public abstract Validator getValidator(Person personalDetails);
	
	public static CreditCardFactory getCreditCardFactory(Person personalDetails)throws CreditCardException{
		if(personalDetails.getBankBalance() == 0){
			throw new CreditCardException("You are not eligible for CreditCard as your Bank balance is zero");
		}
		if(personalDetails.getBankingStatus().equals("Inactive")){
			throw new CreditCardException("You are not eligible for CreditCard as your Bank Account status is inactive");
		}
		if(personalDetails.getCreditScore() <= 500){
			throw new CreditCardException("You are not eligible for CreditCard as your Credit Score is too low");
		}
		
		if(personalDetails.getCreditScore() >= 500 && personalDetails.getCreditScore()<=700){
			return new MasteroFactory();
		}
		if(personalDetails.getCreditScore() > 700){
			return new RupayFactory();
		}
		return null;
	}
}
