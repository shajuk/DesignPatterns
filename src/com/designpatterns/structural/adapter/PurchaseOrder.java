package com.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class PurchaseOrder {
	
	public List<Item> getItems() {
		List<Item> purchaseOrder=new ArrayList<Item>();
		/*
		 * Consider scenario where a shopkeeper had a Book shop in a multi storey building
		 * Later he diversified his business and acquired Toys shop as well. Now his software
		 * show takecare of purchasing toys as well when customer buys toys too.
		 * There is already software for billing toys */
		
		//Purchase books
		Books book=new Books("01", "Thinking in Java", 500);
		purchaseOrder.add(book);
		
		//Purchase Toys
		Toys t=new Toys("02", "Walker", 990);
		//Now the toys is not an item in the existing system, hence we need an adapter so that 
		//we don't modify existing system of toys which can plug toys into new system
		purchaseOrder.add(new ToysAdapter(t));
		return purchaseOrder;
	}
}
