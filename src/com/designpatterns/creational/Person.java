package com.designpatterns.creational.abstractfactory;

public class Person {
	private int creditScore;
	private long bankBalance;
	private String bankingStatus;
	private CardType cardTypeRequested;
	private int frequencyOfBankingTransactions;
	
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	public long getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(long bankBalance) {
		this.bankBalance = bankBalance;
	}
	public String getBankingStatus() {
		return bankingStatus;
	}
	public void setBankingStatus(String bankingStatus) {
		this.bankingStatus = bankingStatus;
	}
	public CardType getCardTypeRequested() {
		return cardTypeRequested;
	}
	public void setCardTypeRequested(CardType cardTypeRequested) {
		this.cardTypeRequested = cardTypeRequested;
	}
	public int getFrequencyOfBankingTransactions() {
		return frequencyOfBankingTransactions;
	}
	public void setFrequencyOfBankingTransactions(
			int frequencyOfBankingTransactions) {
		this.frequencyOfBankingTransactions = frequencyOfBankingTransactions;
	}
	
}
