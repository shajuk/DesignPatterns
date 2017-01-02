package com.designpatterns.structural.adapter;

public class Toys {
	private String toyId;
	private String name;
	private long mrp;
	
	public Toys(String toyId,String name,long mrp) {
		this.setToyId(toyId);
		this.name=name;
		this.mrp=mrp;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMrp() {
		return mrp;
	}

	public void setMrp(long mrp) {
		this.mrp = mrp;
	}

	public String getToyId() {
		return toyId;
	}

	public void setToyId(String toyId) {
		this.toyId = toyId;
	}

}
