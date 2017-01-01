package com.designpatterns.creational.prototype;

public enum ItemType {
	
	MOVIE("01"),BOOK("02"), CAR("03");
	
	private String value;
	
	private ItemType(String value){
		this.value=value;
	}
	
	public String getValue(){
		return this.value;
	}


}
