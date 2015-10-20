package com.newtours.tests;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.newtours.PageClasses.*;

public class Registration {

	WebDriver driver = new FirefoxDriver();
	String baseURl = "http://newtours.demoaut.com/";
	
	@BeforeClass
	public void setup(){
		driver.get(baseURl);
	}
	
	
	@Test
	public void newUserRegisterTest(){	
			
			//driver.findElement(By.linkText("REGISTER")).click();
			HomePage.link_Register(driver).click();
			
			String Title = driver.getTitle();
			Assert.assertEquals("Register: Mercury Tours", Title);
			
			//driver.findElement(By.id("email")).sendKeys("mayurguhe");
			HomePage.email_Textbox(driver).sendKeys("mayurguhe");
			
			
			driver.findElement(By.name("password")).sendKeys("pass1234");
			driver.findElement(By.name("confirmPassword")).sendKeys("pass1234");
			driver.findElement(By.name("register")).click();
			String validate = "Thank you for registering";
			Assert.assertEquals("Thank you for registering", validate);
			
		}
	
	@Test
	public void newUserRegiserNegativeTest(){	
			
			driver.findElement(By.linkText("REGISTER")).click();
			String Title = driver.getTitle();
			Assert.assertEquals("Register: Mercury Tours", Title);
			
		}
	
	@AfterClass
	public void tearDown(){
		driver.close();
	}

}
