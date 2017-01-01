package com.designpatterns.creational.prototype;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<ItemType,Item> items=new HashMap<ItemType,Item>();
	
	public Registry() {
		loadItems();
	}
	
	public Item createItem(ItemType type){
		Item newItem=null;
		try {
			newItem=(Item) items.get(type).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return newItem;
	}
	
	private void loadItems(){
		Movie m=new Movie();
		m.setName("Basic Movie");
		m.setPrice(new BigDecimal(85));
		m.setRuntime("2 hours");
		items.put(ItemType.MOVIE, m);
		
		Book b=new Book();
		b.setName("Basic Book");
		b.setPrice(new BigDecimal(200));
		b.setIsbnNumber("123");
		items.put(ItemType.BOOK, b);
	}
}
