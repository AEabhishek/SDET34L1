package com.vtiger.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStatementOndatabase {
	public static void main(String[] args) throws SQLException {
		
		com.mysql.cj.jdbc.Driver driver=new com.mysql.cj.jdbc.Driver();
		
		
		 DriverManager.registerDriver(driver);
		
		
		 
		 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
				 
				 
				 Statement statement = connection.createStatement();
		 String query = "insert into project(project_id,created_by,created_on,project_name,status,team_size) values('TY_PROJ_303','aboy','28/04/2022','TY_P06','On Going','3')";
		 statement.executeUpdate(query);
		 

		 Statement statement1 = connection.createStatement();
 String query1 = "insert into project(project_id,created_by,created_on,project_name,status,team_size) values('TY_PROJ_403','ardft','28/04/2022','TY_P07','On Going','9')";
 statement.executeUpdate(query1);
		 
		 
	}
}
