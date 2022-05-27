package com.vtiger.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdatesQueryStatement2 {
  private static final int ResultSet = 0;

public static void main(String[] args) throws SQLException 
  {
	  Driver driver=new Driver();
	  
	  DriverManager.registerDriver(driver);
	  
		 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/PROJECTS","root","root");
		 
		 Statement statement=connection.createStatement();
		 String query = "insert into project(project_id,created_by,created_on,project_name,status, team_size)values('TY_PROJ_202','sachin','28/04/2022','tyss03','On Going','8')";
		 
		 ResultSet r = statement.executeQuery(query);
		
		if(ResultSet==1)
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
