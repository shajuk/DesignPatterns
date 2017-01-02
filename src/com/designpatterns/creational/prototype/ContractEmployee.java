package com.designpatterns.creational.prototype;

public class ContractEmployee extends Employee {
	private String contractEndDate;

	public String getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(String contractEndDate) {
		this.contractEndDate = contractEndDate;
	}
	
}
