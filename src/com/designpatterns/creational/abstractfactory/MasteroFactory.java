package com.designpatterns.creational.abstractfactory;

public class MasteroFactory extends CreditCardFactory{

	@Override
	public CreditCard getCreditCard(CardType type) {
		switch (type) {
		case GOLD:
			return new MasteroGoldCard();
		case PLATINIUM:
			return new MasteroPlatiniumCard();
		default:
			return null;
		}
	}

	@Override
	public Validator getValidator(Person personalDetails) {
		if(personalDetails.getCardTypeRequested() ==  CardType.GOLD){
			return new MasteroGoldValidator();
		}
		if(personalDetails.getCardTypeRequested() ==  CardType.PLATINIUM){
			return new MasteroPlatiniumValidator();
		}
		return null;

	}

}
