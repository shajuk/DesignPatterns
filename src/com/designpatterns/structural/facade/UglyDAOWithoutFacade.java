package com.designpatterns.structural.facade;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UglyDAOWithoutFacade {
	public static void main(String[] args) {
		DBConnection instance=DBConnection.getInstance();
		try {
			Connection dbConnection=instance.getConnection();
			Statement st=dbConnection.createStatement();
			String query="CREATE TABLE Employee (ID INTEGER, Name VARCHAR(20), Country VARCHAR(20))";
			int rowsAffected=st.executeUpdate(query);
			System.out.println("Table create ? : "+rowsAffected);
			st.close();
			
			st=dbConnection.createStatement();
			query="INSERT INTO Employee (ID, Name, Country) "
					+ "values (373962, 'Shaju Kuppelan', 'India')";
			 rowsAffected=st.executeUpdate(query);
			if(rowsAffected> 0){
				System.out.println("No of rows Inserted: "+rowsAffected);
			}
			st.close();
			
			st=dbConnection.createStatement();
			query="SELECT * FROM Employee";
			ResultSet rs= st.executeQuery(query);
			System.out.println("Employee details");
			while(rs.next()){
				System.out.println("Employee ID: "+rs.getString(1));
				System.out.println("Employee Name: "+rs.getString(2));
				System.out.println("Country: "+rs.getString(3));
			}
			rs.close();
			st.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
