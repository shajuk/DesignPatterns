package com.designpatterns.creational.factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		Website blogSite=WebsiteFactory.getWebsite(WebsiteType.BLOG);
		System.out.println(blogSite.getPages());
		Website shoppingSite=WebsiteFactory.getWebsite(WebsiteType.SHOP);
		System.out.println(shoppingSite.getPages());
	}
}
