package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");//here we write a link to go inside
		
		driver.findElement(By.id("txtUsername")).sendKeys("VanEarl");      //we found through inspect and click in what we need to see 
		driver.findElement(By.id("txtPassword")).sendKeys("VanEarl@&12");  //after the found the code we checked id what we want to reach 
		driver.findElement(By.id("btnLogin")).click();                     //after write id we sended the user name and password validations
		                                                                   //but for to go inside without any information we just add click 
		
		//driver.findElement(by.) //we have 8 other locaters inside selenium like id we can use them to access the fields
		                          //f.e. ----->  id,className,TagName,LinkText,ParialLinkText,name,xpath,css <-----
		                          //we dont use tagname to get specific location because it is not unique specification our locaters must be unique
		                          //can use tagname to dom elements 
	}

}
