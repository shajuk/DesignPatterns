package com.designpatterns.creational.prototype;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class PrototypeTest {
	
	public static void main(String[] args) {
		EmployeeRegistry employeeRegistry=new EmployeeRegistry();
		PermanentEmployee e1=(PermanentEmployee)employeeRegistry.createEmployee(EmploymentType.PERMANENT);
		e1.setEmployeeId("0001");
		e1.setName("Harish");
		e1.setDateJoining("04-15-2010");
		e1.setPermanentIdNo("11");
		
		PermanentEmployee e2=(PermanentEmployee)employeeRegistry.createEmployee(EmploymentType.PERMANENT);
		e2.setEmployeeId("0002");
		e2.setName("Renjith");
		e2.setDateJoining("04-15-2008");
		e2.setPermanentIdNo("04");
		
		System.out.println(e1.equals(e2));
		System.out.println();
		
	
		
	}

}
