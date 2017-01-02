package com.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterDemo {
	public static void main(String[] args) {
		PurchaseOrder purchaseOrder=new PurchaseOrder();
		List<Item> items=purchaseOrder.getItems();
		System.out.println(items);
	}
}
