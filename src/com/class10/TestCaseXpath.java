package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;

public class TestCaseXpath extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
//		TC 1: HRMS Login
//		Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//		Login to the application by writing xpath based on “parent and child relation”

		setUp("chrome",Constants.HRMS_URL);
		
		driver.findElement(By.xpath("//div[@id='divUsername']//input")).sendKeys("Syntax123!"); //with use from parent to child
		
		driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")).sendKeys("Syntax123!"); //with from last sibling to previous sibling
		Thread.sleep(3000);
		driver.quit();	
		
//		TC 2: HRMS Login
//
//		Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//		Login to the application by writing xpath based on “following and preceding siblings”
		
		setUp("chrome",Constants.HRMS_URL);
		
		
		

	}

}
