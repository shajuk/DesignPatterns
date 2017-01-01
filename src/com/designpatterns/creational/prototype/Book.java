package com.designpatterns.creational.prototype;

public class Book extends Item{
	private String isbnNumber;

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
}
