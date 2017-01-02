package com.designpatterns.creational.abstractfactory;

public class RupayFactory extends CreditCardFactory{

	@Override
	public CreditCard getCreditCard(CardType type) {
		switch (type) {
		case GOLD:
			return new RupayGoldCard();
		case PLATINIUM:
			return new RupayPlatiniumCard();
		default:
			return null;
		}
	}

	@Override
	public Validator getValidator(Person personalDetails) {
		if(personalDetails.getCardTypeRequested() ==  CardType.GOLD){
			return new RupayGoldValidator();
		}
		if(personalDetails.getCardTypeRequested() ==  CardType.PLATINIUM){
			return new RupayPlatiniumValidator();
		}
		return null;
	}

}
