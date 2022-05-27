package com.vtiger.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Updatequerystatement {
	
	public static void main(String[] args) throws SQLException {
		//step 1: create object for implementation class
		com.mysql.cj.jdbc.Driver driver=new com.mysql.cj.jdbc.Driver();
		
		//step2: register driver with JBDC 
		
		 DriverManager.registerDriver(driver);
		
		//establish the database connection
		 
		 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
				 
				 //create statement
				 Statement statement = connection.createStatement();
		 String query = "insert into project(project_id,created_by,created_on,project_name,status,team_size) values('TY_PROJ_203','abhi','28/04/2022','TY_P05','On Going','4')";
		 
		int result = statement.executeUpdate(query);
		if(result==1)
		{
			System.out.println("user is created");
		}
		else
		{
			System.out.println("user is not created");
		}
		 
		 connection.close();
	}


}
