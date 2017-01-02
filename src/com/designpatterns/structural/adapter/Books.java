package com.designpatterns.structural.adapter;

public class Books implements Item{

	private String itemNo;
	private String itemName;
	private long price;
	
	public Books(String itemNo,String itemName,long price) {
		this.itemNo=itemNo;
		this.itemName=itemName;
		this.setPrice(price);
	}
	
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "itemNo: "+itemNo+"	itemName: "+itemName+" price: "+price+"\n";
	}
}
