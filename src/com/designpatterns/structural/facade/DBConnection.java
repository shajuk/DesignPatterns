package com.designpatterns.structural.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static volatile DBConnection instance=null;
	private Connection con=null;
	
	private DBConnection() {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static DBConnection getInstance(){
		if(null==instance){
			synchronized (DBConnection.class) {
				if(null==instance){
					instance=new DBConnection();
				}
			}
		}
		return instance;
	}
	
	public Connection getConnection() throws SQLException{
		if(con==null || con.isClosed()){
			synchronized (DBConnection.class) {
				if(con==null || con.isClosed()){
					con=DriverManager.getConnection("jdbc:hsqldb:file:D:/HSQL/data.sql","SA","SA");
				}
			}
		}
		return con;
	}
}
