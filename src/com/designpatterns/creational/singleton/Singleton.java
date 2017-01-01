package com.designpatterns.creational.singleton;

public class Singleton {
	
	private static Singleton s=null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance(){
		if(null==s){
			synchronized (Singleton.class) {
				if(null==s){
					s=new Singleton();
				}
			}
		}
		return s;
	}

}
