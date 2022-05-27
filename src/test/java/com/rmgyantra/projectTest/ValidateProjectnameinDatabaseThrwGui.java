package com.rmgyantra.projectTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class ValidateProjectnameinDatabaseThrwGui {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		driver.findElement(By.linkText("Projects")).click();
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		String projectName = "SDET34";
		driver.findElement(By.name("projectName")).sendKeys(projectName);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementByname('teamSize')values'2'";
		driver.findElement(By.name("createdBy")).sendKeys("swarna");
		WebElement ele = driver.findElement(By.xpath("//label[.='Project Status ']/following-sibling::select"));
		Select s=new Select(ele);
		s.selectByIndex(2);
		driver.findElement(By.xpath("//input[@value='Add Project']")).click();
	}
	}
		/*
		
		Connection connection=null;
		try
		{
			Driver d=new Driver();
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/PROJECTS","root","root");
			Statement statement=connection.createStatement();
			ResultSet result = statement.executeQuery("select  from project");
			while(result.next())
			{
				if(result.getString("project_name").equals(projectName)
				
				{
					System.out.println("project name is in GUI");
					System.out.println("TC is PASSED");
				}
			
				
		}
		
		catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
				connection.close();
				d.close();
			}
		}
}
		*/