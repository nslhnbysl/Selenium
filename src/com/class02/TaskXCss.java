package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskXCss {

	public static void main(String[] args) {

//		    TC 1: Swag Labs Positive login: 
//			Open chrome browser
//			Go to “https://www.saucedemo.com/”
//			Enter valid username and valid password and click login 
//			Verify robot icon is displayed 
//			Verify “Products” text is available next to the robot icon

//			TC 2: Swag Labs Negative login: 
//			Open chrome browser
//			Go to “https://www.saucedemo.com/”
//			Enter invalid username and password and click login 
//			Verify error message contains: “Username and password do not match any user in this service”
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");	
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Neslihan");
		driver.findElement(By.cssSelector("input[placeholder^='Pass']")).sendKeys("234455");
		driver.findElement(By.cssSelector("input.btn_action")).click();
	}

}
