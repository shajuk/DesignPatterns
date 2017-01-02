package com.designpatterns.creational.prototype;


import java.util.HashMap;
import java.util.Map;

public class EmployeeRegistry {
	
	private Map<EmploymentType,Employee> employees=new HashMap<EmploymentType,Employee>();
	
	public EmployeeRegistry() {
		loadEmployeesFromDB();
	}
	
	public Employee createEmployee(EmploymentType type){
		Employee employee=null;
		try {
			employee=(Employee) employees.get(type).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return employee;
	}
	
	private void loadEmployeesFromDB(){
		PermanentEmployee e1=new PermanentEmployee();
		e1.setPermanentIdNo("##");
		e1.setDateJoining("mm-dd-yyyy");
		e1.setEmployeeId("####");
		e1.setName("name");
		employees.put(EmploymentType.PERMANENT, e1);
		
		ContractEmployee c=new ContractEmployee();
		c.setContractEndDate("mm-dd-yyyy");
		c.setDateJoining("mm-dd-yyyy");
		c.setEmployeeId("####");
		c.setName("name");
		employees.put(EmploymentType.CONTRACTBASED, c);
		
	}
}
