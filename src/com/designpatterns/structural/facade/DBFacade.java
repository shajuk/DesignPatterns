package com.designpatterns.structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBFacade {
	
	private DBConnection instance=null;
	
	public DBFacade() {
		instance=DBConnection.getInstance();
	}
	
	public int createTable(){
		Connection dbConnection;
		int rowsAffected=0;
		try {
			dbConnection = instance.getConnection();
			Statement st=dbConnection.createStatement();
			String query="CREATE TABLE Employee (ID INTEGER, Name VARCHAR(20), Country VARCHAR(20))";
			rowsAffected=st.executeUpdate(query);
			System.out.println("Table create ? : "+rowsAffected);
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rowsAffected;
	}
	
	public int insertRecords(){
		Connection dbConnection;
		int rowsAffected=0;
		Statement st;
		try {
			dbConnection = instance.getConnection();
			st = dbConnection.createStatement();
			String query="INSERT INTO Employee (ID, Name, Country) "
					+ "values (373962, 'Shaju Kuppelan', 'India')";
			 rowsAffected=st.executeUpdate(query);
			if(rowsAffected> 0){
				System.out.println("No of rows Inserted: "+rowsAffected);
			}
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowsAffected;
	}
	
	public List<Employee> getEmployees(){
		List<Employee> employees=new ArrayList<Employee>();
		Connection dbConnection;
		Statement st;
		
		try {
			dbConnection = instance.getConnection();
			st=dbConnection.createStatement();
			String query="SELECT * FROM Employee";
			ResultSet rs= st.executeQuery(query);
			while(rs.next()){
				Employee e=new Employee();
				e.setEmpId(rs.getString(1));
				e.setEmpName(rs.getString(2));
				e.setCountry(rs.getString(3));
				employees.add(e);
			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return employees;
	}
	
}
class Employee{
	private String empId;
	private String empName;
	private String country;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return ""+"Employee ID: "+empId+" Employee Name: "+empName+" Country: "+country;
	}
}
