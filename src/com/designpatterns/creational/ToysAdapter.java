package com.designpatterns.structural.adapter;

public class ToysAdapter implements Item {
	
	private Toys instance;
	
	public ToysAdapter(Toys instance) {
		this.instance=instance;
	}
	
	@Override
	public String getItemNo() {
		return instance.getToyId();
	}

	@Override
	public String getItemName() {
		return instance.getName();
	}

	@Override
	public long getPrice() {
		// TODO Auto-generated method stub
		return instance.getMrp();
	}
	
	@Override
	public String toString() {
		return "itemNo: "+getItemNo()+"	itemName: "+getItemName()+" price: "+getPrice()+"\n";
	}
}
