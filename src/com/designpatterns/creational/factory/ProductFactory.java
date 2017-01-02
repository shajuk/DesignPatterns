package com.designpatterns.creational.factory;

public class ProductFactory {
	 public static Products getProducts(ProductType type){
		 switch(type){
		 	case SPORTS: return new SportsProducts();
		 	case ELECTRONICS: return new ElectronicProducts();
		 	default: return null;
		 }
	 }
}
