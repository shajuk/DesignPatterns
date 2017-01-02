package com.designpatterns.creational.abstractfactory;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		Person personDetails=new Person();
		personDetails.setBankBalance(50000);
		personDetails.setBankingStatus("Active");
		personDetails.setCardTypeRequested(CardType.PLATINIUM);
		personDetails.setCreditScore(850);
		personDetails.setFrequencyOfBankingTransactions(80);
		
		try {
			CreditCardFactory abstractFactory=CreditCardFactory.getCreditCardFactory(personDetails);
			if(abstractFactory.getValidator(personDetails).isValid(personDetails)){
				CreditCard card=abstractFactory.getCreditCard(personDetails.getCardTypeRequested());
				System.out.println("Issued Card: "+card);
			}
		} catch (CreditCardException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
