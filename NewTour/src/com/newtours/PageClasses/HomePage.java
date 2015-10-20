package com.newtours.PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

		public static WebElement element = null;
		
		public static WebElement link_Register(WebDriver driver)
		{
			element = driver.findElement(By.linkText("REGISTER"));
		
			return element;
			
		}
		
		public static WebElement email_Textbox(WebDriver driver)
		{
			element = driver.findElement(By.id("email"));
			return element;
			
		}
		
}
