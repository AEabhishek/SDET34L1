package com.vtiger.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PracticeDatabasetest {
	Connection connection=null;
	public static void main(String[] args) throws SQLException {
		//step 1: create object for implementation class
		com.mysql.cj.jdbc.Driver driver=new com.mysql.cj.jdbc.Driver();
		
		//step2: register driver with JBDC 
		
		 DriverManager.registerDriver(driver);
		
		//establish the database connection
		 
		 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/aron","root","root");
				 
				 //create statement
				 Statement statement = connection.createStatement();
		 
		 ResultSet result = statement.executeQuery("SELECT * FROM SDET00");
		 
		 while(result.next())
		 {
			 System.out.println(result.getString(2));
		 }
		 
		 connection.close();
	}

}
